// Global Variables \\
var globalWord = "";
var currentElement = 1;
var guessedLetters = [];
var found = false;
var used = false;
var winCheck = 0;
var loseCheck = 0;
var computerWords = getColumn("Words", "Word");

// Start & Play Again Button \\
onEvent("sButton", "click", function( ) {
  reset();
  hideElement("sButton");
  showElement("pButton");
  showElement("cButton");
  setText("sButton","Play Again");
});  

//PlayerButton
onEvent("pButton", "click", function( ) {
hideElement("pButton");
hideElement("cButton");
var word = prompt("Type the word you would like to guess");
  globalWord = word;
  showElement("hmInput");
  setText("hmOutput","_");
if (word == null) { //Checks if there is a word
  lose();
  setText("hmOutput", "Next time type a word.");
} else {
for (var i = 0; i < word.length-1; i++) {
  setText("hmOutput",getProperty("hmOutput","text") + " _"); //Creates the letter spaces
  }
}
});

//Computer Button
onEvent("cButton", "click", function( ) {
  hideElement("pButton");
  hideElement("cButton");
  globalWord = computerWords[randomNumber(0,computerWords.length)]; //Selects Random Word
  showElement("hmInput");
  setText("hmOutput","_");
for (var i = 0; i < globalWord.length-1; i++) {
  setText("hmOutput",getProperty("hmOutput","text") + " _");
  }
});  
  


// Main Game \\
onEvent("hmInput", "input", function( ) {
var inputtedLetter = getText("hmInput");
used = false;
for (var e = 0; e < guessedLetters.length; e++) {
  if (inputtedLetter == guessedLetters[e]) {
  setText("hmInput","");
  used = true;
  }
}
if (used == false) { 
appendItem(guessedLetters,inputtedLetter);  
found = false;
setText("hmInput","");
globalWord = globalWord.toLowerCase();
for (var i = 0; i < globalWord.length; i++) {
 if (globalWord.substring(i,i+1) == inputtedLetter) {
  for (var g = 0; i < (globalWord.length*2); g++) {
    if (inputtedLetter == globalWord.substring(i,i+1)) {
      setText("hmOutput",getText("hmOutput").substring(0,i*2) + inputtedLetter + getText("hmOutput").substring(i*2 + 1)); 
      break;
  }
}
    found = true;
    winCheck += 1;
    if (winCheck == globalWord.length) {
    win();
    }
  }
}
  if (found == false) {
    showElement("ele" + currentElement);
    currentElement += 1;
    loseCheck += 1;
     if (loseCheck == 6) {
       lose();
       setText("hmOutput",'The word was "'+globalWord+'"');
     }
  } 
  if (getText("aiOutput") == "") { 
  setText("aiOutput", '"' + inputtedLetter + '"');
  } else {
  setText("aiOutput",getText("aiOutput") + ', "' + inputtedLetter + '"');
  }
}
});

// Functions \\

function reset(){ //Resets whole app for another round
  setText("aiOutput","");
  setText("hmOutput","");
  showElement("hangmanMain");
  hideElement("gameOverLabel");
  hideElement("gameOverIcon");
  globalWord = "";
  currentElement = 1;
  guessedLetters = [];
  found = false;
  used = false;
  winCheck = 0;
  loseCheck = 0;
  for (var u = 1; u < 7; u++) {
    hideElement("ele" + u);
  }
}

function lose() { //Runs when player loses
for (var u = 1; u < 7; u++) {
        hideElement("ele" + u);
       }
      setText("gameOverLabel","You Lose!");
      setProperty("gameOverIcon","image","icon://fa-frown-o");
      showElement("gameOverLabel");
      hideElement("hmInput");
      showElement("gameOverIcon");
      hideElement("hangmanMain");
      showElement("sButton");
}

function win() { //Runs when player wins
setText("hmOutput", globalWord);
  for (var u = 1; u < 7; u++) {
     hideElement("ele" + u);
  }
  setText("gameOverLabel","You Win!");
  setProperty("gameOverIcon","image","icon://fa-trophy");
  showElement("gameOverLabel");
  hideElement("hmInput");
  showElement("gameOverIcon");
  hideElement("hangmanMain");
  showElement("sButton");
}

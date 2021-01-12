var ogList = [];

var newList = [];

function start() {
var userType = prompt("Are you a programmer or player?");

if (userType == "player" || userType == "Player") {
    prompt("Ask a question");
    createResponse();
}
else if (userType == "Programmer" || userType == "programmer"){
  for (var j = 0; j < 10; j++) {
    var question1 = prompt("Add a positive response");
    appendItem(ogList,question1); 
  }
  for (var f = 0; f < 5; f++) {
    var question2 = prompt("Add a neutral response");
    appendItem(ogList,question2); 
  }
  for (var e = 0; e < 5; e++) {
  var question3 = prompt("Add a negitive response");
  appendItem(ogList,question3); 
  }
  for (var k = 0; k < ogList.length; k++) {
  appendItem(newList,ogList[k]);
  }
}
}

onEvent("playScreen", "click", function(){
 start();
});

function createResponse(){
  setText("answerOutput", getResponse(newList));
}

function getResponse(list){
if (list.length > 0) {
  var index = randomNumber(0,list.length-1);
  playSound("sound://category_pop/bubble_pop_cluster_2.mp3");
  var store = list[index];
  removeItem(list,index);
  return store;
} else {
  console.log(ogList);
  console.log(newList);
  return "Game Over";
 }
}

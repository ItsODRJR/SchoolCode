public class Crypt {
  private String encString;
  private String decString;

  public Crypt(String enc, String dec) {
    encString = enc;
    decString = dec;
  }

  public String encode(String message) {
    String encode = "";
    for (int i = 0; i < message.length(); i++) {
      int index = encString.indexOf(message.substring(i, i + 1));
      if (index != -1) {
        encode += decString.substring(index, index + 1);
      } else {
        encode += message.substring(i, i + 1);
      }
    }
    return encode;
  }

  public String decode(String message) {
    String decode = "";
    for (int i = 0; i < message.length(); i++) {
      int index = decString.indexOf(message.substring(i, i + 1));
      if (index != -1) {
        decode += encString.substring(index, index + 1);
      } else {
        decode += message.substring(i, i + 1);
      }
    }
    return decode;
  }
}

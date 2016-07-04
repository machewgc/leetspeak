public class LeetSpeak {
  public static void main(String[] args) {
	  String results = leetSpeak("echo");
	  System.out.println(results);
  }
  public static String leetSpeak(String stringInput) {
    char[] charsInput = stringInput.toCharArray();
    Integer stringInputLength = stringInput.length();
    char[] charsOutput = new char[stringInputLength];

    for (Integer i = 0; i < stringInput.length(); i++) {
      if ((charsInput[i] == 's' || charsInput[i] == 'S') && i > 0) {
        charsOutput[i] = 'z';
      } else if (charsInput[i] == 'L') {
        charsOutput[i] = '1';
      } else if (charsInput[i] == 'o') {
        charsOutput[i] = '0';
      } else if (charsInput[i] == 'e') {
        charsOutput[i] = '3';
      } else {
        charsOutput[i] = charsInput[i];
      }
    }

    String stringOutput = new String(charsOutput);
    return stringOutput;
  }
}

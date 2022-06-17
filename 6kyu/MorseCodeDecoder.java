public class MorseCodeDecoder {
    public static String decode(String morseCode) {
      System.out.println(morseCode);
      morseCode = morseCode.trim();
      String result = "";
      
      String[] arr = morseCode.split("   ");
      String[] temp;
      for(String x : arr) {
        temp = x.split(" ");
        
        for(String letter : temp) {
          result += MorseCode.get(letter);
        }
        
        result += " ";
      }
      return result.trim();  
      // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
    }
}
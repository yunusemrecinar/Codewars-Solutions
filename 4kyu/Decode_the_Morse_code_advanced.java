import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MorseCodeDecoder {
    public static String removeLeadingZeroes(String s) {
      StringBuilder sb = new StringBuilder(s);
      while (sb.length() > 0 && sb.charAt(0) == '0') {
          sb.deleteCharAt(0);
      }
     return sb.toString();
    }

    public static String removeTrailingZeroes(String s) {
      StringBuilder sb = new StringBuilder(s);
      while (sb.length() > 0 && sb.charAt(sb.length() - 1) == '0') {
         sb.setLength(sb.length() - 1);
      }
      return sb.toString();
    }
  
    public static String decodeBits(String bits) {
      bits = removeTrailingZeroes(bits);
      bits = removeLeadingZeroes(bits);
      System.out.println(bits);
      int rate = getRate(bits);
      String wordsZ = "";
      String lettersZ = "";
      String harfZ = "";
      String dot = "";
      String dash = "";
      
      for(int i = 0; i < rate; i++) {
          wordsZ += "0000000";
          lettersZ += "000";
          harfZ += "0";
          dot += "1";
          dash += "111";
      }
      
      String[] words = bits.split(wordsZ);
      String[] letters;
      String[] harf;
      String result = "";
      
      for(String x : words) {
        letters = x.split(lettersZ);
        
        for(String letter : letters) {
          harf = letter.split(harfZ);
          
          for(String h : harf) {
            if(h.equals(dot)) result += ".";
            else result += "-";
          }
          result += " ";
        }
        result = result.trim();
        result += "   ";
      }
      return result.trim();
    }
    
    public static int getRate(String bits) {
        int rate = Integer.MAX_VALUE;
        Matcher matcher = Pattern.compile("1+|0+").matcher(bits);
        while (matcher.find()) {
            rate = Math.min(rate, matcher.group().length());
        }
        return rate;
    }
    
    public static String decodeMorse(String morseCode) {
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
    }
}
public class Kata {

  public static String encrypt(final String text, final int n) {
    if(text == null ) return null;
    if(text.length() == 0) return "";
    String result = text;
    String temp = text;
    int count = 0;
    String right = "";
    String left = "";
    
    while(count < n) {
      for(int i = 0; i < temp.length(); i++) {
        if(i %2 == 0) {
          right += temp.substring(i,i+1);
        }else {
          left += temp.substring(i,i+1);
        }
      }
      result = left + right;
      temp = result;
      left = "";
      right = "";
      count++;
    }
    
    // Your code here
    return result;
  }
  
  public static String decrypt(final String encryptedText, final int n) {
    if(encryptedText == null ) return null;
    if(encryptedText.length() == 0) return "";
    int middlePoint = encryptedText.length() /2;
    String even = "";
    String odd = "";
    String result = encryptedText;
    String temp = encryptedText;
    int count = 0;
    String merge = "";
    
    while(count < n) {
      for(int i = 0; i < temp.length(); i++) {
        if(i < middlePoint) {
          //odd
          odd += temp.substring(i,i+1);
        }else {
          //even
          even += temp.substring(i,i+1);
        }
      }
      
      if(temp.length() %2 == 0) {
        for(int i = 0; i < odd.length(); i++) {
          merge += even.substring(i,i+1);
          merge += odd.substring(i,i+1);
        }
        temp = merge;
        merge = "";
        even = "";
        odd = "";
        result = temp;
        count++;
      }else {
        for(int i = 0; i < odd.length(); i++) {
          merge += even.substring(i,i+1);
          merge += odd.substring(i,i+1);
        }
        merge += even.substring(even.length()-1,even.length());
        temp = merge;
        merge = "";
        even = "";
        odd = "";
        result = temp;
        count++;
      }
    }
    
    
    return result;
  }
  
}
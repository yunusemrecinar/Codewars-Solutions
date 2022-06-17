public class BackspacesInString {
  public static String cleanString(String s) {
      String result = "";
      String[] temp = s.split("");
      
      for(String x : temp) {
        if(x.equals("#")) {
          if(result.length() != 0) {
            result = result.substring(0,result.length()-1);
          }
        }else {
          result += x;
        }
        
        System.out.println(result);
      }
      
      return result;
    
    }
}
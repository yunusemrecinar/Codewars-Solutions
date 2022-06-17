import java.util.*;
public class StockList { 
  
  // 1st parameter is the stocklist (L in example), 
  // 2nd parameter is list of categories (M in example)
  public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
    // your code here
    if(lstOfArt.length == 0 || lstOf1stLetter.length == 0) return "";
    
    HashMap<String,Integer> map = new HashMap<String,Integer>();
    String firstLetter = "";
    String[] temp;
    
    for(String x : lstOfArt) {
      temp = x.split(" ");
      
      if(map.containsKey(temp[0].substring(0,1))) {
        map.replace(temp[0].substring(0,1), map.get(temp[0].substring(0,1)) + Integer.parseInt(temp[1]));
      }else {
        map.put(temp[0].substring(0,1), Integer.parseInt(temp[1]));
      }  
    }
    String result = "";
    for(String x : lstOf1stLetter) {
      if(map.get(x) == null) result += "(" + x + " : "+ 0 + ") - ";
      else result += "(" + x + " : "+ map.get(x) + ") - ";
    }
    
    return result.substring(0,result.length()-3);
  }
}
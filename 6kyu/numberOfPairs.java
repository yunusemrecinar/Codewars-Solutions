import java.util.*;
class Kata {
  public static int numberOfPairs(String[] gloves) {
    HashMap<String,Integer> map = new HashMap<String,Integer>();
    int sum = 0;
    
    for(String x : gloves) {
      if(map.containsKey(x)) {
        map.replace(x, map.get(x)+1);
      }else{
        map.put(x,1);
      }
    }
    
    for(int x : map.values()) {
        sum += x - (x%2);
    }
    
    return sum/2;
  }
}
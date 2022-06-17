import java.util.HashMap;
import java.util.Map.Entry;

public class Kata
{
  public static int TripleDouble(long num1, long num2) {
    System.out.println(num1 + " " + num2);
    
    HashMap<String,Integer> map1 = new HashMap<>();
    HashMap<String, Integer> map2 = new HashMap<>();
    boolean check = false;
    String[] num11 = String.valueOf(num1).split("");
    String[] num21 = String.valueOf(num2).split("");
    
    
    for(String x : num11) {
      if(map1.containsKey(x)) {
        map1.replace(x, map1.get(x), map1.get(x) + 1);
      }else {
        map1.put(x, 1);
      }
    }
    
    for(String x : num21) {
      if(map2.containsKey(x)) {
        map2.replace(x, map2.get(x), map2.get(x) + 1);
      }else {
        map2.put(x, 1);
      }
    }
    
    String value = "";
    String value2 = "";
    
    System.out.println(map1);
    System.out.println(map2);
    
    for(Entry<String,Integer> x : map1.entrySet()) {
      int t = x.getValue();
      if(t >= 3) {
        value = x.getKey();
      }
    }
    
    for(Entry<String,Integer> x : map2.entrySet()) {
      int t = x.getValue();
      if(t == 2 && value.equals(x.getKey())) {
        check = true;
      }
    }
      return check == true ? 1 : 0;
    }
   
  
}
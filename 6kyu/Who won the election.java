import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

public class BallotsCounter {

    public static String getWinner(final List<String> listOfBallots) {
      //Your code
      int res = -1;
      String result = "";
      HashMap<String, Integer> map = new HashMap<String, Integer>();
      
      for(String x :listOfBallots) {
        if(map.containsKey(x)) {
          map.replace(x, map.get(x) + 1);
        }else {
          map.put(x, 1);
        }
      }
      int count = listOfBallots.size()/2;
      
      for(Entry x : map.entrySet()) {
          if((int)x.getValue() > count) {
              res = (int)x.getValue();
              result = (String) x.getKey();
             
          }
      }
      
      return res == -1 ? null : result;
      
    }
}
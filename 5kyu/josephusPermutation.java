import java.util.*;

public class Josephus {
 public static <T> List<T> josephusPermutation(final List<T> items, final int k) {

      List<T> temp = new ArrayList<T>();
      List<Integer> indexes = new ArrayList<Integer>();
      int count = 0;
      
      for(int i = 0; i < items.size(); i++) {
          indexes.add(i);
      }
      
      while(indexes.size() > 0) {
          count = (count +k -1) % indexes.size();
          
              temp.add(items.get(indexes.get(count)));
              indexes.remove(count);
             
          }
               return temp;
      }
}
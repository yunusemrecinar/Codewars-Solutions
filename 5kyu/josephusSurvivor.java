import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class JosephusSurvivor {
  public static int josephusSurvivor(final int n, final int k) {
    List<Integer> temp = new ArrayList<Integer>();
      List<Integer> indexes = new ArrayList<Integer>();
      int count = 0;
      List<Integer> items = new ArrayList<Integer>();
      for(int i = 0; i < n; i++) {
          indexes.add(i);
        items.add(i+1);
      }
      
      while(indexes.size() > 0) {
          count = (count +k -1) % indexes.size();
          
              temp.add(items.get(indexes.get(count)));
              indexes.remove(count);
             
      }
    return temp.get(temp.size()-1);
  }  
}
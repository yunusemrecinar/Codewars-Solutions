package cw;
import java.util.HashSet;
import java.util.Set;
public class Interval {

    public static int sumIntervals(int[][] intervals) {
    Set<Integer> set = new HashSet<>();
    
    if(intervals == null || intervals.length == 0)
      return 0;
      
    for(int i = 0; i < intervals.length; i++) {
      int[] temp = intervals[i];
      int x = temp[0];
      int y = temp[1];
      
      for(int j = x; j < y; j++) {
        if(set.contains(j)) {
          continue;
        }else {
          set.add(j);
        }
      }
    }
    
    return set.size();
    
    
    }
}
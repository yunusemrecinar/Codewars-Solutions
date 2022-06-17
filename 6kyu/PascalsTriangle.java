import java.util.*;
public class PascalsTriangle {
    public static long[] generate(int depth) {
     
  ArrayList<ArrayList<Long>> allrows = new ArrayList<ArrayList<Long>>();
  ArrayList<Long> row = new ArrayList<Long>();
  for(int i=0;i<depth;i++)
  {
    row.add(0, 1L);
    for(int j=1;j<row.size()-1;j++)
      row.set(j, row.get(j)+row.get(j+1));
    allrows.add(new ArrayList<Long>(row));
  }
            
        long[] array = new long[(depth*(depth+1))/2];
        int count = 0;
        for(ArrayList<Long> arr : allrows) {
            for(long x : arr) {
                array[count++] = x;
            }
        }
        return array;
    }
}
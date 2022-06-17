import java.util.HashSet;
import java.util.Set;
public class Solution {

  public int solution(int number) {
    Set<Integer> set = new HashSet<Integer>();
      
        
        
        for(int i = 1 ; i < number; i++) {
            if(i %3 == 0 || i %5 == 0) {
                set.add(i);
            }
        }
        
        Object[] arr = set.toArray();
        
        int sum = 0;
        for(Object x : arr) {
            System.out.println(x);
            sum += Integer.parseInt(String.valueOf(x));
        }
        
        System.out.println(sum);
        return sum;
  }
}
import java.util.ArrayList;
public class ConsonantValue {
    public static int solve(final String s) {
      System.out.println(s);
        String letters = "aeiou";
      
      int sum = 0;
      String[] arr = s.split("");
      
      ArrayList<Integer> list = new ArrayList<>();    
      
      for(String x : arr) {
        if(letters.contains(x)) {
          list.add(sum);
          sum = 0;
        }else {
          char ch = x.charAt(0);
          sum += (int)ch - 96;
        }
      }
      list.add(sum);
      
      int max = list.get(0);
      
      for(int x : list) {
        if(x > max)
          max = x;
      }
      return max;

    }
}public class Kata {
  public static int[][] matrixAddition(int[][] a, int[][] b) {
    int[][] res = new int[a.length][a[0].length];
    
    for(int i= 0; i<a.length; i++) {
      for(int j = 0; j < a[0].length; j++) {
        res[i][j] = a[i][j] + b[i][j];
      }
    }
    
    return res;
  }
}
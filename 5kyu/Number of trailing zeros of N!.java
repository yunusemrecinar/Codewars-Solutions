public class Solution {
  
  public static int zeros(int n) {
     if (n < 0) 
            return -1;
 
       
        int count = 0;
 
       
        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;
 
        return count;
}
}
/*
int count = 0;
    int last = 0;
    int max = 0;
      
    double res = f(n);
    
    while(res >= 1) {
      last = (int)(res % 10);
      if(last == 0) {
        count++;
        
        if(count > max) {
          max = count;
        }
      }
      else {
        count = 0;
      }
      res /= 10;
    }
  return max;

*/
/*
 System.out.println(n);
    int max = 0;
    int count = 0;
    
    if(n == 0)
      return 0;
    
    double num = f(n);
    
    String temp = String.valueOf(num);
    System.out.println(temp);
    for(int i = 0; i < temp.length(); i++) {
      
      if(temp.charAt(i) == '0') {
        count++;
        
        if(max < count) 
          max = count;
      }
      else {
        count = 0;
      }
    }
    
    
    return max;
*/
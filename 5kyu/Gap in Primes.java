import java.util.Arrays;
import java.util.ArrayList;
class GapInPrimes {
    
    public static long[] gap(int g, long m, long n) {
        ArrayList<Integer> list = new ArrayList<>();
        int lastOne = -1;
        int lastSecond = -1;
        
        for(int i = (int)m; i <= (int)n; i++) {
            if(!isPrime(i)){
               list.add(i);
              lastSecond = lastOne;
              lastOne = i;
            }
          
          if(lastOne - lastSecond == g) {
            return new long[] {lastSecond, lastOne};
          }
               
        }
        
        return null;
    }
    
    public static boolean isPrime(int num){    

        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
          
          if (num % i == 0) {
            flag = true;
            break;
          }
        }
        return flag;
    }   
}
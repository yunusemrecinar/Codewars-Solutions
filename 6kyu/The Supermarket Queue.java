import java.util.Arrays;
public class Solution {
  public static int solveSuperMarketQueue(int[] customers, int n) {
      
        int sum = 0;
      int[] nCustomers;
      int[] restOfCustomers;
      
      if(customers.length == 0)
        return 0;
      else if(customers.length == 1)
        return customers[0];
      else {
        if(n == 0)
          return 0;
        else if(n == 1)
          sum = sumOfArray(customers);
        else if(customers.length <= n) {
          int max = customers[0];
          
          for(int i = 0; i < customers.length; i++) {
            if(customers[i] > max)
              max = customers[i];
          }
          
          return max;
        }
        
        else {
          nCustomers = Arrays.copyOfRange(customers,0,n);
          restOfCustomers = Arrays.copyOfRange(customers,n,customers.length);
          
          int serviceTime = 0;
          
          while(sumOfArray(nCustomers) > 0) {
            for(int i = 0; i < nCustomers.length; i++) {
              if(nCustomers[i] > 0) {
                nCustomers[i] = nCustomers[i] - 1;
                
              }
                
              
              if(nCustomers[i] == 0) {
                if(restOfCustomers.length == 0)
                  continue;
                else {
                  nCustomers[i] = restOfCustomers[0];
                      restOfCustomers = Arrays.copyOfRange(restOfCustomers,1,restOfCustomers.length);
                }
                
              }
            }
            serviceTime++;
            System.out.println(Arrays.toString(nCustomers));
            System.out.println(serviceTime);
          }
         return serviceTime;
        }
      }
      return sum;
    }
  
    public static int sumOfArray(int[] arr) {
      int sum = 0;
      
      for(int i = 0; i < arr.length; i++) {
        sum += arr[i];
      }
      
      return sum;
    }
    
}
class Thirteen {
    
    public static long thirt(long n) {
        int sum = 0;
      int[] arr = {1,10,9,12,3,4};
      int index = 0;
      int count = 0;
      int temp = 0;
      A : while(true) {
        
        String num = String.valueOf(n);
        
        for(int i = num.length()-1; i >= 0; i--) {
          
          sum += Integer.parseInt(num.substring(i,i+1)) * arr[index++];
          
          
          if(index == arr.length) index = 0;
          
        }
        
        if(sum == temp){
          break A;
        }else {
          
          n = sum;
          temp = sum;
          sum = 0;
          index = 0;
        }
        
        
      }
      
      return sum;
      
    }
}
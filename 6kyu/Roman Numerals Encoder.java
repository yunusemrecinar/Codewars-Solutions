public class Conversion {

    public String solution(int n) {
      System.out.println(n);
      String res = "";
      int num = 0;
      
      int[] array = {1000,500,100,50,10,5,1};
      String[] array2 = {"M","D","C","L","X","V","I"};
      
      while(n > 0) {
        
        for(int i = 0; i < array.length; i++) {
          
          num = n / array[i];
          
          if(num == 4) {
            res += array2[i] + array2[i-1];
            n -= num * array[i];
          }
          else if(num >= 1 && num <= 3) {
            if(i != array.length -1 && i != 0 && (n/(array[i-1] - array[i+1]) == 1)) {
              res += array2[i+1] + array2[i-1];
              n -= array[i-1] - array[i+1];
            }else {
              for(int j = 0; j < num; j++) {
                res += array2[i];
              }
              n -= num * array[i];
            }
            
          }
          
        }
      }
      return res;
    }
}
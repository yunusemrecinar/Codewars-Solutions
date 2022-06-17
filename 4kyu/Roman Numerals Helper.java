public class RomanNumerals {
 
  public static String toRoman(int n) {
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
  
  
  
  
  
  public static int fromRoman(String romanNumeral) {

    int count1 = 0;
    int count2 = -1;
    int count3 = -1;
    int result = 0;
    
    int[] array = {1000,500,100,50,10,5,1};
    String[] array2 = {"M","D","C","L","X","V","I"};
    String[] roman = romanNumeral.split("");
    
    for(int i = 0; i < roman.length; i++) {
      
      for(int x = 0; x < array2.length; x++) {
        if(roman[i].equals(array2[x])) {
          count1 = x;
          break;
        } 
      }
      
      if(i > 0) {
        for(int x = 0; x < array2.length; x++) {
          if(roman[i-1].equals(array2[x])) {
            count2 = x;
            break;
          } 
        }
      }
      
      if(i < roman.length-1) {
        for(int x = 0; x < array2.length; x++) {
          if(roman[i+1].equals(array2[x])) {
            count3 = x;
            break;
          } 
        }
      }
      
//      if(count2 == -1) {
//        result += array[count1];
//      }else 
        if(count3 != -1 && count3 < count1) {
          continue;
      }  
        else {
        
        if(count2 != -1 &&(count2 > count1)) {
          result += array[count1] - array[count2];
        }else {
          result += array[count1];
        }
        
      }
      
    }
    
    
    return result;
    
    
    
    
  }
}
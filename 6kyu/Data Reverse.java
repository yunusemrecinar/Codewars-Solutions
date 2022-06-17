public class Kata {
 public static int[] DataReverse(int[] data) {
      int[] res = new int[data.length];
      int count = 0;
      int count2 = 0;
      
      for(int i= data.length-8; i >= 0; i++) {
        if(count2 == 8) {
          i -= 16;
          count2 = 0;
        }
        
        if(i < 0) {
          break;
        }
        System.out.println(i);
        res[count++] = data[i];
        count2++;
        
        
      }
   
   return res;
  }
}
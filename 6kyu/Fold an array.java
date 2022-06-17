import java.util.Arrays;
public class Kata
{
  public static int[] foldArray(int[] array, int runs)
    {
    int[] arr = Arrays.copyOf(array, array.length);
    int[] temp;
    int count = 0;
    
    while(runs > 0) {
      
      temp = new int[(int)Math.ceil(arr.length/2.0)];
      
      if(arr.length %2 == 0) {
        
        for(int i = 0; i < arr.length/2; i++) {
          temp[count++] = arr[i] + arr[arr.length-i-1];
        }
        count = 0;
        
      }else {
        
        for(int i= 0; i < arr.length/2; i++) {
          temp[count++] = arr[i] + arr[arr.length-i-1];
        }
        temp[count] = arr[(arr.length/2)];
        count = 0;
        
      }
      
      arr = Arrays.copyOf(temp, temp.length);
      runs--;
    }
      return arr;
    }
}
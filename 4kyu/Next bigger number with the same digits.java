import java.util.Arrays;
public class Kata
{
    public static long nextBiggerNumber(long n)
    {
      String num = String.valueOf(n);
      String[] arr = num.split("");
      
      char[] mt = new char[arr.length];
      
      for(int i = 0; i < arr.length; i++) {
        mt[i] = num.charAt(i);
      }
      
      return findNext(mt, mt.length);
    }
  // Utility function to swap two digit
    static void swap(char ar[], int i, int j)
    {
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
 
    // Given a number as a char array number[],
    // this function finds the next greater number.
    // It modifies the same array to store the result
    static long findNext(char ar[], int n)
    {
        int i;
         
        // I) Start from the right most digit
        // and find the first digit that is smaller
        // than the digit next to it.
        for (i = n - 1; i > 0; i--)
        {
            if (ar[i] > ar[i - 1]) {
                break;
            }
        }
         
        // If no such digit is found, then all
        // digits are in descending order means
        // there cannot be a greater number with
        // same set of digits
        if (i == 0)
        {
            return -1;
        }
        else
        {
            int x = ar[i - 1], min = i;
             
            // II) Find the smallest digit on right
            // side of (i-1)'th digit that is greater
            // than number[i-1]
            for (int j = i + 1; j < n; j++)
            {
                if (ar[j] > x && ar[j] < ar[min])
                {
                    min = j;
                }
            }
 
            // III) Swap the above found smallest
            // digit with number[i-1]
            swap(ar, i - 1, min);
 
            // IV) Sort the digits after (i-1)
            // in ascending order
            Arrays.sort(ar, i, n);
          String res = "";
          
          for(char ch : ar) {
            res += String.valueOf(ch);
          }
            return Long.parseLong(res);
        }
    }
}
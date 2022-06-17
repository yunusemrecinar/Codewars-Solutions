import java.util.*;
public class CountIPAddresses {

  public static long ipsBetween(String start, String end) {
    String[] arr1 = start.split("\\.");
    String[] arr2 = end.split("\\.");
    
    long[] ip1 = new long[4];
    long[] ip2 = new long[4];
    
    for(int i = 0; i < arr1.length; i++) {
      ip1[i] = Long.parseLong(arr1[i]);
    }
    System.out.println(Arrays.toString(ip1));
    for(int i = 0; i < arr2.length; i++) {
      ip2[i] = Long.parseLong(arr2[i]);
    }
    System.out.println(Arrays.toString(ip2));
    
    long sum = 0;
    
    sum += (ip2[3] - ip1[3]);
    System.out.println(sum + " first");
    sum += (ip2[2] - ip1[2]) * 256 ;
    System.out.println(sum+ " second");
    sum += (ip2[1] - ip1[1]) * 256 * 256;
    System.out.println(sum + " third");
    sum += (ip2[0] - ip1[0]) * 256 * 256 * 256;
    System.out.println(sum + " forth");
    
    return sum;
  }
}
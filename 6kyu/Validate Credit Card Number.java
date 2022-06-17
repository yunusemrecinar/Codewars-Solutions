public class Validate{
  public static boolean validate(String n){
    System.out.println(n);
    // TODO: solution
    int sum = 0;
    String[] arr = n.split("");
    
    if(n.length() %2 == 0) {
      
      for(int i = 0; i < arr.length; i += 2) {
        int num = Integer.parseInt(arr[i])  * 2;
        
        if(num > 9) {
          int temp = num %10 + 1;
          num = temp;
        }
        
        arr[i] = String.valueOf(num);
      }
      
      for(String x : arr) {
        sum += Integer.parseInt(x);
      }
      
    }else {
      
      for(int i = 1; i < arr.length; i += 2) {
        int num = Integer.parseInt(arr[i])  * 2;
        
        if(num > 9) {
          int temp = num %10 + 1;
          num = temp;
        }
        
        arr[i] = String.valueOf(num);
      }
      
      for(String x : arr) {
        sum += Integer.parseInt(x);
      }
      
    }
    System.out.println(sum);
    return sum % 10 == 0 ? true : false;
  }
}
public class Kata {
  public static boolean validPhoneNumber(String phoneNumber) {
    System.out.println(phoneNumber);
    String temp = "abcdefghijklmnopqqrstuvwxyz*";
    boolean res = true;
    
      if(phoneNumber.charAt(0) != '(')
          return false;
      if(phoneNumber.charAt(4) != ')')
          return false;
      if(phoneNumber.charAt(9) != '-')
          return false;
    for(int i= 0; i < phoneNumber.length(); i++) {
       if(temp.contains(phoneNumber.substring(i,i+1)))
          return false;
    }
     
      
    
    if(res){
      res= false;
     if(phoneNumber.length() == 14){
       if(phoneNumber.charAt(0) == '(')
         if(phoneNumber.charAt(4) == ')')
           if(phoneNumber.charAt(9) == '-')
             res = true;
     }
      }
    
    return res;
       
  }
}
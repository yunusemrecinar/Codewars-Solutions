import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
public class WeightSort {
  
  public static int getDigit(long num) {
        int sum = 0;
        
        while(num > 0) {
            sum += num%10;
            num/=10;
        }
        
        return sum;
    }
    public static boolean sort(long num1, long num2) {
        String numOne = String.valueOf(num1);
        String numTwo = String.valueOf(num2);
        boolean check = false;
        int checkI = 0;
        
        if(numOne.length() <= numTwo.length()) {
            for(int i = 0; i < numOne.length(); i++) {
                if(Long.parseLong(String.valueOf(num1).substring(i,i+1)) < Long.parseLong(String.valueOf(num2).substring(i,i+1))) {
                    
                    check= true;
                    checkI = 1;
                    break;
                }else if(Long.parseLong(String.valueOf(num1).substring(i,i+1)) == Long.parseLong(String.valueOf(num2).substring(i,i+1))) {
                    continue;
                }else {
                    check = false;
                    checkI = 1;
                    break;
                }
            }
        }else {
            for(int i = 0; i < numTwo.length(); i++) {
                if(Long.parseLong(String.valueOf(num1).substring(i,i+1)) < Long.parseLong(String.valueOf(num2).substring(i,i+1))) {
                    check = true;
                    checkI = 1;
                    break;
                }else if(Long.parseLong(String.valueOf(num1).substring(i,i+1)) == Long.parseLong(String.valueOf(num2).substring(i,i+1))) {
                    continue;
                }else {
                    check = false;
                    checkI = 1;
                    break;
                }
            }
        }
        
        if(checkI == 0) {
            if(numOne.length() < numTwo.length())
                return true;
            else 
                return false;
        }else
        return check;
    }
    public static String orderWeight(String strng) {
     System.out.println(strng);
  String[] stringArr  = strng.split(" ");
       
       if(stringArr.length == 0) 
        return strng;
      else if(stringArr.length  == 1)
        return strng;
      
        long[] numArr = new long[stringArr.length];
        int index = 0;
    for(String x : stringArr) {
      numArr[index++] = Long.parseLong(x);
    }

    ArrayList<Long> kList = new ArrayList<>();
    ArrayList<Long> vList = new ArrayList<>();
    
    for(long x : numArr) {
        kList.add(x);
        vList.add(Long.parseLong(String.valueOf(getDigit(x))));
    }
    ArrayList<Long> sortedVList = new ArrayList<>();
    
    for(long x : vList) {
        sortedVList.add(x);
    }
    
    Collections.sort(sortedVList);
    
    ArrayList<Long> keyList = new ArrayList<>();
    
    for(long x : sortedVList) {
        long temp = -1;
        int indexCheck = 0;
        
        int indexItem = vList.indexOf(x);
        temp = kList.get(indexItem);
        
        if(keyList.isEmpty()) {
            keyList.add(temp);
            indexCheck = 1;
            int indexKey = kList.indexOf(temp);
            kList.remove(indexKey);
            vList.remove(indexKey);
        }     
        else {
            
            
            A :for(int k = 0; k < keyList.size(); k++) {
                long item = keyList.get(k);
                
                int value = getDigit(item);
            if(value == x) {
                 if(sort(temp,item)) {
                    keyList.add(k,temp);
                    indexCheck = 1;
                    int indexKey = kList.indexOf(temp);
                    kList.remove(indexKey);
                    vList.remove(indexKey);
                    break A;
                }
            }else if(x < value) {
                keyList.add(k,temp);
                indexCheck = 1;
                int indexKey = kList.indexOf(temp);
                kList.remove(indexKey);
                vList.remove(indexKey);
                break A;
            }
        }
        }
        if(indexCheck == 0) {
             keyList.add(temp);
            int indexKey = kList.indexOf(temp);
            kList.remove(indexKey);
            vList.remove(indexKey);
        }
           
       

    }
    String result = "";
    
    for(long x : keyList) {
        result += x + " ";
    }
        return result.trim();
    }
}
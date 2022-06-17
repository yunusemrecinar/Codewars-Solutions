import java.util.List;
import java.util.ArrayList;
public class Solution {
    public static String getOrder(String input) {
        List<String> result = new ArrayList<String>();
      
      String[] menu = new String[]{
                "Burger",
                "Fries",
                "Chicken",
                "Pizza",
                "Sandwich",
                "Onionrings",
                "Milkshake",
                "Coke"};
      
      for(String item : menu) {
        
        int i = input.indexOf(item.toLowerCase());
        
        while(i > -1) {
          result.add(item);
          i = input.indexOf(item.toLowerCase(),i+1);
        }
        
      }
      return String.join(" ", result);
    }
}
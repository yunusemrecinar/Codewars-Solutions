import java.util.*;
import java.util.stream.Collectors;
public class TopWords {
    
    public static List<String> top3(String s) {
      System.out.println(s);
        // Your code here
        s = s.toLowerCase();
        s = s.replace(".", " ");
        s = s.replace("!", " ");
        s = s.replace("#", " ");
        s = s.replace("$", " ");
        s = s.replace("%", " ");
        s = s.replace("&", " ");
        s = s.replace("(", " ");
        s = s.replace(")", " ");
        s = s.replace("*", " ");
        s = s.replace("+", " ");
        s = s.replace(",", " ");
        s = s.replace("-", " ");
        s = s.replace("/", " ");
        s = s.replace(":", " ");
        s = s.replace(";", " ");
        s = s.replace("=", " ");
        s = s.replace(">", " ");
        s = s.replace("?", " ");
        s = s.replace("@", " ");
        s = s.replace("\\"," ");
        s = s.replace("]", " ");
        s = s.replace("^", " ");
        s = s.replace("_", " ");
        s = s.replace("{", " ");
        s = s.replace("|", " ");
        s = s.replace("}", " ");
        s = s.replace("~", " ");
        
        String[] arr = s.split(" ");
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(String x : arr) {
         if(x.trim().equals("") || x.equals("'") || x.equals("''")|| x.equals("'''")|| x.equals("''''"))
                continue;
            if(map.containsKey(x))
                map.replace(x, map.get(x) + 1);
            else 
                map.put(x, 1);
        }
        
        List<String> keys = map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(3).map(Map.Entry::getKey).collect(Collectors.toList());

        return keys;
    }
}
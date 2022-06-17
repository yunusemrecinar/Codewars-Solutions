public class RailFenceCipher {
    
    static String encode(String s, int n) {
        // Your code here
      char[][] rail = new char[n][s.length()];
      
      for(int i = 0; i < n; i++) {
        for(int j = 0; j < s.length(); j++) {
          rail[i][j] = '\n';
        }
      }
      
      boolean down = false;
      int row = 0, col = 0;
      
      for(int i = 0; i < s.length(); i++) {
        
        if(row == 0 || row == n-1) 
          down = !down;
        
        rail[row][col++] = s.charAt(i);
        
        if(down) row++;
        else row--;
        
      }
      
      String result = "";
      for(int i = 0; i < n; i++) {
          for(int j = 0; j < s.length(); j++) {
              if(rail[i][j] != '\n')
                  result += rail[i][j];
          }
      }
      
        return result;
    }
    
    static String decode(String s, int n) {
        // Your code here
        char[][] rail = new char[n][s.length()];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < s.length(); j++) {
                rail[i][j] = '\n';
            }
        }
        
        boolean down = true;
        
        int row = 0, col = 0;
        
        for(int i = 0; i < s.length(); i++) {
            
            if(row == 0)
                down = true;
            if(row == n-1)
                down = false;
            
            rail[row][col++] = '*';
            
            if(down == true) row++;
            else row--;
             
        }
        
        int index = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < s.length(); j++) {
                if(rail[i][j] == '*' && index < s.length())
                    rail[i][j] = s.charAt(index++);
            }
        }
        
        String result = "";
        row = 0;
        col = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(row == 0) down = true;
            if(row == n-1) down = false;
            
            if(rail[row][col] != '*')
                result += rail[row][col++];
            
            if(down) row++;
            else row--;
        }
        return result;
    }
}
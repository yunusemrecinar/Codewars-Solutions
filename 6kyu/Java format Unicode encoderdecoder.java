public class JavaUnicodeEncoder {
    public static String decode(final String input) {
        String temp = input;
        temp = temp.replace("\\", "");
        String[] arr = temp.split("u");
        String res = "";
        
        for(int i = 1; i < arr.length; i++) {
            int hex = Integer.parseInt(arr[i],16);
            res += (char)hex;
        }
        
        return res;
    }

    public static String encode(String input) {
        StringBuilder builder = new StringBuilder();
          for (char c : input.toCharArray()) {
              builder.append("\\u" + Integer.toHexString(c | 0x10000).substring(1));
          };
          return builder.toString();
    }
}
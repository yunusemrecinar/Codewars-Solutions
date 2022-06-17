fun incrementString(str: String) : String {
        var temp = str.toLowerCase()
        var count = 0;

        for(i in 0..str.length-1) {
            if(str[i].toChar().isLetter())
                count++;
        }

        if(str.length == count) {
            return str + "1";
        }else {
            var result = str.substring(0,count);
            var digit = str.substring(count,str.length).toInt() +1
            
            if(digit.toString().length == str.substring(count,str.length).length)
                return result + digit
            else {
                var count2 = str.substring(count,str.length).length - digit.toString().length
                var zeros = "";
                
                for(i in 0..count2-1) {
                    zeros += "0";
                }
                
                return result + zeros + digit
            }
                
        }
    }
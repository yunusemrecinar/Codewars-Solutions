package solution

object PrimeDecomp {
    fun factors(l: Int): String {
        var n = l
        var str = ""
        
        for(i in 2..n) {
            var c = 0
            while(n%i == 0) {c++; n /= i}
            if(c == 1) str += "(" + i + ")"
            if(c > 1) str += "(" + i + "**" + c + ")"
        }
        return str
    }
}
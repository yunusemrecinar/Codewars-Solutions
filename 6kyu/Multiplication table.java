package kata

object KataSolution {
    fun multiplicationTable(size: Int): Array<IntArray> {
        val list = Array(size) {IntArray(size)}
        
        for(i in 1..size) {
            for(j in 1..size) {
                list[i-1][j-1] = i*j
            }
        }
        return list
    }
}
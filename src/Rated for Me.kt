fun main(args: Array<String>) {
    val R = readLine()!!.toInt()
    if(R < 1200) {
        println("ABC")
    } else if(R >= 1200 && R < 2800) {
        println("ARC")
    } else {
        println("AGC")
    }
}
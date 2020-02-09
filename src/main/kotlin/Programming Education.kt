fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    if(N == 1) {
        println("Hello World")
    } else if(N == 2) {
        val N2 = readLine()!!.toInt()
        val N3 = readLine()!!.toInt()
        val TOTL = N2 + N3
        println(TOTL)
    }

}
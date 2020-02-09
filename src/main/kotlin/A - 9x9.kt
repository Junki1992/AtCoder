fun main(args: Array<String>) {
    val list = readLine()!!.split(" ").map(String ::toInt)
    val A   = list[0]
    val A2  = list[1]
    val ans = A * A2
    if(A <= 9 && A2 <=9) {
        println(ans)
    } else {
        println("-1")
    }
}
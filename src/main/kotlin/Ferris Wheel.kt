fun main(args: Array<String>) {
    val List = readLine()!!.split(" ").map(String::toInt)
    val A = List[0]
    val B = List[1]
    if(A >= 13) {
        println(B)
    } else if(A >= 6 && A <= 12) {
        println(B / 2)
    } else if (A <= 5) {
        println(0)
    }
}
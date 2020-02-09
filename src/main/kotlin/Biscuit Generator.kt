fun main(args: Array<String>) {
    val List = readLine()!!.split(" ").map(String::toInt)
    val A = List[0]
    val B = List[1]
    val T = List[2]
    val Count = 0
    println(T / A * B)
}
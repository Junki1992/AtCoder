fun main(args: Array<String>) {
    val List = readLine()!!.split(" ").map(String::toInt)
    val A = List[0]
    val B = List[1]
    if(A * B * A % 2 == 0) {
        println("No")
    } else {
        println("Yes")
    }
}
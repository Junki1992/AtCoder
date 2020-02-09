fun main(args: Array<String>) {
    val List = readLine()!!.split(" ").map(String::toInt)
    val N = List[0]
    val A = List[1]
    val B = List[2]
    val C = N * A
    if(C > B) {
        println(B)
    } else {
        println(C)
    }
}
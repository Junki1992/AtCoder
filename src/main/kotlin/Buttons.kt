fun main(args: Array<String>) {
    val List = readLine()!!.split(" ").map(String::toInt)
    val A     = List[0]
    val B     = List[1]
    if(A > B) {
        println(A + A - 1)
    } else if(A < B) {
        println(B + B - 1)
    } else if(A == B) {
        println(A + B)
    }
}
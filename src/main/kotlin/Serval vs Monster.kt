fun main(args: Array<String>) {
    val List = readLine()!!.split(" ").map(String::toInt)
    var H = List[0]
    val A = List[1]
    var count = 0
    do {
        H = H - A
        count = count + 1
    } while(H > 0)
    println(count)
}
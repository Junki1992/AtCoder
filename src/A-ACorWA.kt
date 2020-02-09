fun main(args: Array<String>) {
    val list = readLine()!!.split(" ").map(String::toInt)
    if(list[0] == list[1]) {
        println("Yes")
    } else {
        println("No")
    }
}
fun main(args: Array<String>) {
    val list = readLine()!!.split(" ").map(String::toInt)
    var A = list[0]
    var B = list[1]
    val C = A - B * 2
    if(C < 0) {
        println(0)
    } else {
        println(C)
    }
}
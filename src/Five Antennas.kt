fun main(args: Array<String>) {
    val A = readLine()!!.toInt()
    val B = readLine()!!.toInt()
    val C = readLine()!!.toInt()
    val D = readLine()!!.toInt()
    val E = readLine()!!.toInt()
    val k = readLine()!!.toInt()
    if(E - A <= k) {
        println("Yay!")
    } else {
        println(":(")
    }
}
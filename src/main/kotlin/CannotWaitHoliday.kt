fun main(args: Array<String>) {
    val a = readLine()!!.toString()
    val day = arrayOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")
    if(a == day[0]) {
        println("7")
    } else if(a == day[1]) {
        println("6")
    } else if(a == day[2]) {
        println("5")
    } else if(a == day[3]) {
        println("4")
    } else if(a == day[4]) {
        println("3")
    } else if(a == day[5]) {
        println("2")
    } else if(a == day[6]) {
        println("1")
    }
}
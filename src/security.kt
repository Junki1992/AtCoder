fun main(Args: Array<String>) {
    val List = readLine()!!
    val S1 = List[0]
    val S2 = List[1]
    val S3 = List[2]
    val S4 = List[3]
    if(S1 == S2 || S2 == S3 || S3 == S4) {
        println("Bad")
    } else {
        println("Good")
    }
}
fun main(args: Array<String>) {
    val List = readLine()!!.toCharArray()
    val S1 = List[0]
    val S2 = List[1]
    val S3 = List[2]
    val S4 = List[3]
    if(S1 == S2 && S3 == S4 || S1 == S4 && S2 == S3 || S1 == S3 && S2 ==S4) {
        println("Yes")
    } else {
        println("No")
    }
}
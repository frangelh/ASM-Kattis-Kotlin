fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ')
    //2b - a = R2
    val X1 = a.toInt()
    val S = b.toInt()
    println((2 * S) - X1)
}
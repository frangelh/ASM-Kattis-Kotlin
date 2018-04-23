import java.lang.Math.sqrt

fun main(args: Array<String>) {
    val (a, b, c) = readLine()!!.split(' ').map(String::toInt)
    for (i in 1..a) {
        val n = readLine()!!.toDouble()
        if (n <= sqrt(((b * b) + (c * c)).toDouble())) {
            println("DA")
        } else {
            println("NE")
        }
    }
}
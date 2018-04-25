import java.text.DecimalFormat

fun main(args: Array<String>) {
    val x = readLine()!!.toDouble()
    val n = readLine()!!.toInt()
    var sum: Double = 0.0
    for (i in 1..n) {
        val (a, b) = readLine()!!.split(' ').map(String::toDouble)
        sum += a * b
    }
    val res: Double = sum * x
    println(DecimalFormat("#0.0000000").format(res))

}
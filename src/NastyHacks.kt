fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        val (a, b, c) = readLine()!!.split(' ').map(String::toFloat)
        var res: String
        if (a + c < b) {
            res = "advertise"
        } else if (a + c > b) {
            res = "do not advertise"
        } else {
            res = "does not matter"
        }
        println(res)
    }
}
fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        val (a, b, c) = readLine()!!.split(' ').map(String::toFloat)
        var res = "Impossible"
        if (a + b == c || a + c == b || b + c == a) {
            res = "Possible"
        } else if (a - b == c || a - c == b || b - c == a) {
            res = "Possible"
        } else if (a * b == c || a * c == b || b * c == a) {
            res = "Possible"
        } else if (a / b == c || a / c == b || b / c == a) {
            res = "Possible"
        }
        println(res)
    }

}
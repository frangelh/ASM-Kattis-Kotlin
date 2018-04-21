fun main(args: Array<String>) {
    var (a, b) = readLine()!!.split(' ').map(String::toInt)
    when {
        b - 45 >= 0 -> {
            b -= 45
        }
        b - 45 < 0 && a > 0 -> {
            a -= 1
            b = 60 + (b - 45)
        }
        b - 45 < 0 && a <= 0 -> {
            a = 23
            b = 60 + (b - 45)
        }

    }
    println("$a $b")

}

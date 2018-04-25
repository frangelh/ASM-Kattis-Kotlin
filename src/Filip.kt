fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map { it.reversed().toInt() }
    when {
        a > b -> print(a)
        b > a -> print(b)
    }
}
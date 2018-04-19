fun main(args: Array<String>) {
    val (x, y) = readLine()!!.split(' ')
    // c/a = b -> c = a*b - (a-1)
    val a = x.toInt()
    val b = y.toInt()
    val c = a * b - (a - 1)
    print(c)
}
fun main(args: Array<String>) {
    val x = readLine()!!.split(' ').map(String::toInt)
    val x1 = 1 - x[0]
    val x2 = 1 - x[1]
    val x3 = 2 - x[2]
    val x4 = 2 - x[3]
    val x5 = 2 - x[4]
    val x6 = 8 - x[5]
    print("$x1 $x2 $x3 $x4 $x5 $x6")
}


fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val x = readInts(' ')
    var c = 0
    for (i in 1..n) {
        when {
            x[i - 1] < 0 -> c++;
        }
    }
    print(c)

}

fun readInts(separator: Char = ' ') =
        readLine()!!.split(separator).map(String::toInt)



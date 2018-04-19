fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val x = readLine()!!.split(' ').map(String::toInt)
    var c = 0
    for (i in 1..n) {
        when {
            x[i - 1] < 0 -> c++;
        }
    }
    print(c)
}





fun main(args: Array<String>) {
    val L = readLine()!!.toInt()
    val D = readLine()!!.toInt()
    val X = readLine()!!.toInt()

    var M = D
    var N = L
    for (i in L..D) {
        var flag: Int = 0
        i.toString().toCharArray().map { it }.forEach {
            flag += it.toString().toInt()
        }
        when {
            L < D && X == flag && i < M -> M = i
            L < D && X == flag && i > N -> N = i

        }
    }

    print("$M\n$N")
}
fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    for (i in 1..n) {
        val m = readLine()!!.toInt()
        var arr = ArrayList<String>()
        var count = 0
        for (j in 1..m) {
            val x = readLine()!!
            if (!arr.contains(x)) {
                count++
            }
            arr.add(x)
        }
        println(count)
    }
}
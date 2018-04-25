fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var ara = ArrayList<String>()
    var arb = ArrayList<String>()

    for (i in 0 until n) {
        val (a, b) = readLine()!!.split(' ')
        if (!ara.contains(a)) {
            ara.add(a)
            arb.add(b)
        }
    }
    for (i in 0 until 12) {
        println("${ara[i]} ${arb[i]}")
    }

}
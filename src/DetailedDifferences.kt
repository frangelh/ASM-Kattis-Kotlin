fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var ara = ArrayList<String>()
    var arb = ArrayList<String>()

    for (i in 1..n) {
        val a = readLine()!!
        val b = readLine()!!
        ara.add(a)
        arb.add(b)
    }

    for (i in 0 until n) {
        var resp = ""
        for (j in 0 until ara[i].length) {
            if (ara[i][j] == arb[i][j]) {
                resp += "."
            } else {
                resp += "*"
            }
        }
        print("${ara[i]}\n" +
                "${arb[i]}\n" +
                "$resp\n")

    }

}
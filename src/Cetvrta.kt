fun main(args: Array<String>) {

    val arb = ArrayList<Coordinate>()

    for (i in 1..3) {
        val (a, b) = readLine()!!.split(' ').map(String::toInt)
        arb.add(Coordinate(a, b))
    }
    var missing = ""
    for (i in 0 until arb.size) {
        for (j in 0 until arb.size) {
            if (!arb.contains(Coordinate(arb[i].a, arb[j].b))) {
                missing = "${arb[i].a} ${arb[j].b}"
            } else if (!arb.contains(Coordinate(arb[j].a, arb[i].b))) {
                missing = "${arb[j].a} ${arb[i].b}"
            }
        }
    }
    println(missing)
}

data class Coordinate(val a: Int, val b: Int)

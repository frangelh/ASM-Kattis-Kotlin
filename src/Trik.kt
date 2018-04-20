fun main(args: Array<String>) {
    val input = readLine()!!.toCharArray()
    var cups: IntArray = intArrayOf(1, 0, 0)
    input.forEach {
        when (it) {
            'A' -> {
                val flag = cups[0]
                cups[0] = cups[1]
                cups[1] = flag
            }
            'B' -> {
                val flag = cups[1]
                cups[1] = cups[2]
                cups[2] = flag
            }
            'C' -> {
                val flag = cups[0]
                cups[0] = cups[2]
                cups[2] = flag
            }
        }
    }
    print(cups.indexOf(1) + 1)

}

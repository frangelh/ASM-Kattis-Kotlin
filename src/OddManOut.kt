fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    for (i in 1..n) {
        val x = readLine()!!.toInt()
        val input = readLine()!!.split(' ').map(String::toInt)
        var arr = ArrayList<Int>()
        for (j in 0 until x) {
            if (arr.contains(input[j])) {
                arr.remove(input[j])
            } else {
                arr.add(input[j])
            }
        }
        println("Case #$i: ${arr[0]}")
    }

}
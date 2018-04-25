fun main(args: Array<String>) {
    var arr = ArrayList<Int>()
    for (i in 1..10) {
        val n = readLine()!!.toInt()
        val mod = n % 42
        if (!arr.contains(mod)) {
            arr.add(mod)
        }
    }
    print(arr.size)
}
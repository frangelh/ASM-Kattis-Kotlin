fun main(args: Array<String>) {
    var n = 0
    var input = ArrayList<Par>()
    var ids = ArrayList<String>()
    var idi = 0
    while (n != -1) {
        n = readLine()!!.toInt()
        if (n != -1) {
            val id = "$n$idi"
            ids.add(id)
            idi++
            for (i in 1..n) {
                val (a, b) = readLine()!!.split(' ')
                input.add(Par(id, a.toInt(), b.toInt()))
            }
        }
    }
    ids.forEach { id ->
        var sum = 0
        var time = 0
        input.filter { id == it.id }.forEach {
            sum += it.a * (it.b - time)
            time = it.b
        }
        print("$sum miles\n")
    }
}

data class Par(val id: String, val a: Int, val b: Int)



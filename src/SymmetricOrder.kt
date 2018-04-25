fun main(args: Array<String>) {
    var n = -1
    var input = ArrayList<SymmetricStack>()
    var ids = ArrayList<String>()
    var idi = 0
    while (n != 0) {
        n = readLine()!!.toInt()
        if (n != 0) {
            val id = "$n$idi"
            ids.add(id)
            for (i in 1..n) {
                val m = readLine()!!
                if (i % 2 == 0) {
                    input.add(SymmetricStack(id, 0, m))
                } else {
                    input.add(SymmetricStack(id, 1, m))
                }
            }
            idi++
        }
    }
    for (i in 0 until ids.size) {
        val id = ids[i]
        val stack1 = input.filter { id == it.id && it.par == 1 }
        val stack2 = input.filter { id == it.id && it.par == 0 }
        println("SET ${i + 1}")
        stack1.forEach {
            println(it.text)
        }
        stack2.reversed().forEach {
            println(it.text)
        }
    }
}

data class SymmetricStack(val id: String, val par: Int, val text: String)



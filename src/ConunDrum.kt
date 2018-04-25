fun main(args: Array<String>) {
    val input = readLine()!!

    var count = 0
    var j = 0
    var par = "PER"
    for (i in 0 until input.length) {
        if (input[i] != par[j]) {
            count++
        }
        j++

        if (j == par.length) {
            j = 0
        }
    }
    println(count)
}
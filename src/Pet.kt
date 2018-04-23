fun main(args: Array<String>) {
    var max = 0
    var maxi = 0
    for (i in 1..5) {
        val x = readLine()!!.split(' ').map(String::toInt)
        var sum = 0
        x.forEach {
            sum += it
        }
        if (sum > max) {
            max = sum
            maxi = i
        }
    }
    print("$maxi $max")
}


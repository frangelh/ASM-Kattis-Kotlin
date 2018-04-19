fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val x = readLine()!!.split(' ').map(String::toInt)
    var bpb = 0.0
    var sum = 0.0
    x.forEach {
        when {
            it < 0 -> bpb += 1L
            it > 0 -> sum += it
        }
    }
    val res: Double = sum / (n - bpb)
    print(res)
}


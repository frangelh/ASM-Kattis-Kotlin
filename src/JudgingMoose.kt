fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    when {
        a == 0 && b == 0 -> print("Not a moose")
        a == b -> print("Even ${a + b}")
        else -> {
            if (a > b) {
                print("Odd ${a * 2}")
            } else {
                print("Odd ${b * 2}")
            }
        }
    }

}
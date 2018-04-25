fun main(args: Array<String>) {
    val (x, y, n) = readLine()!!.split(' ').map(String::toInt)

    for (i in 1..n) {
        when {
            i % x == 0 && i % y == 0 -> print("FizzBuzz")
            i % x == 0 -> print("Fizz")
            i % y == 0 -> print("Buzz")
            else -> print(i)
        }
        print("\n")
    }
}
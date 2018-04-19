fun main(args: Array<String>) {
    val x = readLine()!!.toInt()
    val y = readLine()!!.toInt()

    when{
        x > 0 && y > 0 -> print(1)
        x < 0 && y > 0 -> print(2)
        x < 0 && y < 0 -> print(3)
        x > 0 && y < 0 -> print(4)
    }
}
fun main(args: Array<String>) {
    val input = readLine()!!
    var newString = input[0].toString()
    (1 until input.length)
            .filter { input[it] != input[it - 1] }
            .forEach { newString += input[it] }
    print(newString)

}
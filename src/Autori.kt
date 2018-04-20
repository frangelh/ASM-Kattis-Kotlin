fun main(args: Array<String>) {
    val x = readLine()!!.split('-').map(String::toString)
    x.forEach {
        print(it[0])
    }

}
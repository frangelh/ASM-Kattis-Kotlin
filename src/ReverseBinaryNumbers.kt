fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var str = Integer.toString(n,2)
    var ret = Integer.parseInt(str.reversed(),2)
    println(ret)

}
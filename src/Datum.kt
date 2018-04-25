import java.util.*


fun main(args: Array<String>) {
    val (d, m) = readLine()!!.split(' ').map(String::toInt)
    val date = GregorianCalendar(2009, m - 1, d).time.day
    val weekdays = arrayListOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    println(weekdays[date])
}
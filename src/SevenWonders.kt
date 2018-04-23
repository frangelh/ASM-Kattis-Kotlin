fun main(args: Array<String>) {

    val x = readLine()!!
    var T = 0
    var C = 0
    var G = 0
    x.forEach {
        when (it) {
            'T' -> T++
            'C' -> C++
            'G' -> G++
        }

    }
    var menor = 10000
    if (T < menor) {
        menor = T
    }
    if (C < menor) {
        menor = C
    }
    if (G < menor) {
        menor = G
    }
    when {
        T > 0 && C > 0 && G > 0 -> print((T * T + C * C + G * G) + 7 * menor)
        else -> print(T * T + C * C + G * G)
    }

}
fun main(args: Array<String>) {
    val words = readLine()!!.split(' ')
    var duplicates = false
    words.forEach {
        if (words.subList(words.indexOf(it) + 1, words.size).contains(it)) {
            duplicates = true
        }
    }
    if(duplicates){
        print("no")
    }else{
        print("yes")
    }
}
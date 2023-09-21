package lesson_6

fun main() {

    val userInput = readln().toInt()
    var second = userInput

    while (second > 0) {
        second--
        println(second)
        if (second == 0) {
            println("Прошло $userInput секунд")
        }
    }
}
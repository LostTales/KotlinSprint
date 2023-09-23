package lesson_6

fun main() {

    val userInput = readln().toInt()
    var second = userInput

    while (second > 0) {
        second--
        Thread.sleep(1000)
        println("Осталось секунд: $second")
    }

    if (second == 0) println("Время вышло")

}
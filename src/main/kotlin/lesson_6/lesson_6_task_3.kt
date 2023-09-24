package lesson_6

fun main() {

    val userInput = readln().toInt()
    var second = userInput

    while (second > 0) {
        println("Осталось секунд: ${second--}")
        Thread.sleep(1000)
    }

    println("Время вышло")

}
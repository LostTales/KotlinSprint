package lesson_7

fun main() {

    val userInput = readln().toInt()

    for (second in userInput downTo 0) {
        println("Осталось секунд: $second")
        Thread.sleep(1000)
    }
    println("Время вышло")

}
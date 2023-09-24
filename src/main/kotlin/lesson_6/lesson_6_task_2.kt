package lesson_6

fun main() {

    val userInput = readln().toInt()
    var second = userInput

    while (second > 0) {
        println(second--)
        Thread.sleep(1000)
    }

    println("Прошло $userInput секунд")

}
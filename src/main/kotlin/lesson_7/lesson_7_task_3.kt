package lesson_7

fun main() {

    println("Введите число:")
    val userNumber = readln().toInt()
    val rangeOfNumbers = 0..userNumber

    for (number in rangeOfNumbers) {
        if (number % 2 == 0) println(number)
    }
}
package lesson_7

fun main() {

    do {
        val code = (1000..9999).random()
        println("Ваш код авторизации: $code")
        println("Введите код:")
        val userAnswer = readln().toInt()
        if (userAnswer != code) println("Неверный код.")
    } while (userAnswer != code)

    println("Добро пожаловать!")

}
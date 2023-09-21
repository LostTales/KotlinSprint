package lesson_6

fun main() {

    var number1 = (1..9).random()
    var number2 = (1..9).random()

    println("Ведите сумму двух чисел: $number1 + $number2")
    var userAnswer = readln().toInt()

    var sumOfNumbers = number1 + number2

    var numberOfTrials = 3

    while (numberOfTrials > 0) {
        if (userAnswer == sumOfNumbers) {
            println("Добро пожаловать!")
            break
        } else {
            println("Неправильный ответ. Повторно пройдите тест.")
            numberOfTrials--
            number1 = (1..9).random()
            number2 = (1..9).random()
            println("Ведите сумму двух чисел: $number1 + $number2")
            userAnswer = readln().toInt()
            sumOfNumbers = number1 + number2
        }
        if (numberOfTrials == 0) {
            println("Доступ запрещён.")
            return
        }
    }
}
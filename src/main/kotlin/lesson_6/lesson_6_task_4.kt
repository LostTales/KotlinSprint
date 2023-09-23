package lesson_6

fun main() {

    val randomNumber = (1..9).random()
    var numberOfTrials = 5

    while (numberOfTrials > 0) {

        var guessTheNumber = readln().toInt()

        if (guessTheNumber == randomNumber) {
            println("Это была великолепная игра!")
            return
        } else {
            println("Неверно. Количество попыток ${numberOfTrials--}")
        }
    }

    if (numberOfTrials == 0) println("Было загадано число $randomNumber")


}
package lesson_6

fun main() {

    val randomNumber = (1..9).random()
    var guessTheNumber = readln().toInt()
    var numberOfTrials = 5 - 1

    while (numberOfTrials > 0) {

        if (guessTheNumber == randomNumber) {
            println("Это была великолепная игра!")
            return
        } else {
            println("Неверно. Количество попыток $numberOfTrials")
            numberOfTrials--
            guessTheNumber = readln().toInt()
        }
        if (numberOfTrials == 0) {
            println("Было загадано число $randomNumber")
        }
    }
}
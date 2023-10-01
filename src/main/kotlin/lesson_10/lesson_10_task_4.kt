package lesson_10

fun main() {

    var manScore = 0
    var computerScore = 0
    var numberOfGame = 0

    do {
        ++numberOfGame

        println("Ход игрока.")
        val manPoints = rollTheDice()
        println("Всего очков: $manPoints")

        println("Ход компьютера.")
        val computerPoints = rollTheDice()
        println("Всего очков: $computerPoints")

        if (manPoints > computerPoints) {
            println("Победило человечество")
            ++manScore
        } else if (manPoints == computerPoints) {
            println("Ничья")
        } else {
            println("Победила машина")
            ++computerScore
        }

        println("Хотите бросить кости ещё раз? Введите Да или Нет")

    } while (repeatGame(readln()))

    println("Игрок выиграл $manScore партий из $numberOfGame")

}

fun rollTheDice2(): Int {

    val firstRoll = (1..6).random()
    println("Первый бросок, выпало: $firstRoll")

    val secondRoll = (1..6).random()
    println("Второй бросок, выпало: $secondRoll")

    return firstRoll + secondRoll

}

fun repeatGame(userAnswer: String) = userAnswer.lowercase() == ANSWER

const val ANSWER = "да"
package lesson_10


fun main() {

    println("Ход игрока.")

    val manPoints = rollTheDice()
    println("Всего очков: $manPoints")

    println("Ход компьютера.")

    val computerPoints = rollTheDice()
    println("Всего очков: $computerPoints")

    val result = if (manPoints > computerPoints) {
        "Победило человечество"
    } else if (manPoints == computerPoints) {
        "Ничья"
    } else {
        "Победила машина"
    }

    println(result)

}

fun rollTheDice(): Int {

    val firstRoll = (1..6).random()
    println("Первый бросок, выпало: $firstRoll")

    val secondRoll = (1..6).random()
    println("Второй бросок, выпало: $secondRoll")

    return firstRoll + secondRoll

}
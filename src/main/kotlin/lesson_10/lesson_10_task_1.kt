package lesson_10

fun rollTheDice() = (1..6).random()
fun main() {

    println("Ход игрока.")

    var dice1 = rollTheDice()
    println("Первый бросок, выпало: $dice1")

    var dice2 = rollTheDice()
    println("Второй бросок, выпало: $dice2")

    val manPoints = dice1 + dice2
    println("Всего очков:$manPoints")


    println("Ход компьютера.")

    dice1 = rollTheDice()
    println("Первый бросок, выпало: $dice1")

    dice2 = rollTheDice()
    println("Второй бросок, выпало: $dice2")

    val computerPoints = dice1 + dice2
    println("Всего очков:$computerPoints")

    val result = if (manPoints > computerPoints) {
        "Победило человечество"
    } else if (manPoints == computerPoints) {
        "Ничья"
    } else {
        "Победила машина"
    }

    println(result)

}
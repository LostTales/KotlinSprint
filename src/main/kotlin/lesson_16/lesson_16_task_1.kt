package lesson_16

fun main() {

    val numberOfDice = Dice()
    numberOfDice.getNumberOfDice()
}

class Dice {

    private val randomNumber = (1..6).random()

    fun getNumberOfDice() = println("Выпало число $randomNumber")
}
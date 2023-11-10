package lesson_18

fun main() {

    val dice4: NewDice = DiceOn4Sides()
    val dice6: NewDice = DiceOn6Sides()
    val dice8: NewDice = DiceOn8Sides()

    println(dice4.getDiceNumber())
    println(dice6.getDiceNumber())
    println(dice8.getDiceNumber())
    println()
    val allDice = listOf<NewDice>(dice4, dice6, dice8)
    allDice.forEach { println(it.getDiceNumber()) }
}

open class NewDice {
    open fun getDiceNumber() = ""
}

class DiceOn4Sides(
    private val minValue: Int = 1,
    private val maxValue: Int = 4,
) : NewDice() {
    override fun getDiceNumber(): String {
        return "Выпало число: ${(minValue..maxValue).random()}"
    }
}

class DiceOn6Sides(
    private val minValue: Int = 1,
    private val maxValue: Int = 6,
) : NewDice() {
    override fun getDiceNumber(): String {
        return "Выпало число: ${(minValue..maxValue).random()}"
    }
}

class DiceOn8Sides(
    private val minValue: Int = 1,
    private val maxValue: Int = 8,
) : NewDice() {
    override fun getDiceNumber(): String {
        return "Выпало число: ${(minValue..maxValue).random()}"
    }
}
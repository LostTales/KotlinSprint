package lesson_16

fun main() {
    println("Игра началась!")

    val player1 = Player("Hero", 100, 1)

    do {
        println("Игрок ${player1.name} сражается с противником. Здоровье ${player1.showHeals()}")
        val randomNumber = (NUMBER_1..NUMBER_2).random()
        if (randomNumber == NUMBER_1) {
            player1.takeDamage()
            println("Игрок ${player1.name} получил урон. Здоровье ${player1.showHeals()}")
        } else {
            player1.healing()
            println("Игрок ${player1.name} выпил лечебное зелье. Здоровье ${player1.showHeals()}")
        }
    } while (player1.showHeals() > ZERO)

    player1.getHealthIsOver(player1)

    println("Игрок погиб.\nИгра закончена.")
}

class Player(
    val name: String,
    private var health: Int,
    private var forceOfBlow: Int,
) {

    fun showHeals() = health

    fun takeDamage() {
        health -= NUMBER_1
    }

    fun healing() {
        if (health > ZERO) health += NUMBER_1
    }

    private fun healthIsOver() {
        forceOfBlow = ZERO
        health = ZERO
    }

    fun getHealthIsOver(player: Player) {
        healthIsOver()
    }
}

const val ZERO = 0
const val NUMBER_1 = 1
const val NUMBER_2 = 2
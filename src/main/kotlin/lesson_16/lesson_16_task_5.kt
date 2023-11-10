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
            player1.heal()
            println("Игрок ${player1.name} выпил лечебное зелье. Здоровье ${player1.showHeals()}")
        }
    } while (player1.showHeals() > ZERO)

    player1.getLoseAllHealth()

    println("Игрок погиб.\nИгра закончена.")
}

class Player(
    val name: String,
    private var health: Int,
    private var forceOfBlow: Int,
) {

    private var maxHealth = health
        set(value) {
            if (value == field) field = value
        }

    fun showHeals() = health

    fun takeDamage() {
        health -= NUMBER_1
    }

    fun heal() {
        if (health in NUMBER_1..<maxHealth) health += NUMBER_1
    }

    private fun loseAllHealth() {
        forceOfBlow = ZERO
        health = ZERO
    }

    fun getLoseAllHealth() {
        loseAllHealth()
    }
}

private const val ZERO = 0
private const val NUMBER_1 = 1
private const val NUMBER_2 = 2
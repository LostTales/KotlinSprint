package lesson_16

fun main() {
    println("Игра началась!")

    val player1 = Player()
    var playerHealth = player1.showHeals()

    do {
        println("Игрок ${player1.name} сражается с противником. Здоровье $playerHealth")
        val randomNumber = (NUMBER_1..NUMBER_2).random()
        if (randomNumber == NUMBER_1) {
            playerHealth = player1.takeDamage(playerHealth)
            println("Игрок ${player1.name} получил урон. Здоровье $playerHealth")
        } else {
            playerHealth = player1.healing(playerHealth)
            println("Игрок ${player1.name} выпил лечебное зелье. Здоровье $playerHealth")
        }
    } while (playerHealth > ZERO)

    player1.getHealthIsOver(player1)

    println("Игрок погиб.\nИгра закончена.")
}

class Player {

    val name: String = "Hero"
    private var health: Int = 1
    var forceOfBlow: Int = 1

    fun showHeals() = health

    fun takeDamage(_health: Int): Int {
        val health2 = _health - NUMBER_1
        return health2
    }

    fun healing(_health: Int): Int {
        val health2 = _health + NUMBER_1
        return health2
    }

    private fun healthIsOver() {
        healing(ZERO).minus(healing(ZERO))
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
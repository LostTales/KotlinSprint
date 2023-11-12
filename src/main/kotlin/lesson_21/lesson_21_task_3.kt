package lesson_21

fun main() {

    val player1 = NewPlayer20("player1", 50, 100)
    player1.healNewPlayer()
    println(player1.isHealthy())
}

class NewPlayer20(
    private val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
) {
    val healNewPlayer = {
        currentHealth = maxHealth
        println("Игрок выпил лечебное зелье, здоровье $currentHealth")
        currentHealth
    }
}

fun NewPlayer20.isHealthy(): Boolean {
    return currentHealth == maxHealth
}
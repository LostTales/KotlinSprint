package lesson_20

fun main() {

    val player1 = NewPlayer("player1", 50, 100)
    player1.healNewPlayer()
}

class NewPlayer(
    private val name: String,
    private var currentHealth: Int,
    private val maxHealth: Int,
) {
    val healNewPlayer = {
        currentHealth = maxHealth
        println("Игрок выпил лечебное зелье, здоровье $currentHealth")
        currentHealth
    }
}
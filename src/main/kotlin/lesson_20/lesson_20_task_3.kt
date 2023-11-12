package lesson_20

fun main() {

    val player1 = PlayerWithTheKey("player1", false)
    val player2 = PlayerWithTheKey("player2", true)
    println(player1.openTheDoor())
    println(player2.openTheDoor())
}

class PlayerWithTheKey(
    private val name: String,
    private val isPlayerHaveAKey: Boolean,
) {
    val openTheDoor: () -> String = {
        if (isPlayerHaveAKey) "Игрок $name открыл дверь." else "Дверь заперта."
    }
}
package lesson_19

fun main() {

    val spaceship = Battleship("Conqueror", 1000, false, 250)
    spaceship.activateTakeoffMode()
    spaceship.activateLandingMode()
    spaceship.activateAsteroidDestructionMode()
}

abstract class Spaceship(
    private val name: String,
    private val speed: Int,
    private val hasDamage: Boolean,
) {
    open fun activateTakeoffMode() {}
    open fun activateLandingMode() {}
    open fun activateAsteroidDestructionMode() {}
}

class Battleship(
    name: String,
    speed: Int,
    hasDamage: Boolean,
    private val mainBatteryGuns: Int,
) : Spaceship(name, speed, hasDamage) {
    override fun activateTakeoffMode() {
        println("Активирован режим взлета.")
    }

    override fun activateLandingMode() {
        println() // TODO write a text
    }

    override fun activateAsteroidDestructionMode() {
        TODO("call the println and write a text")
    }
}



package lesson_19

fun main() {

    val tank = Tank("turtle", 100)
    tank.fireAShot(tank.chargeWeapon(Ammunition.NOTHING))
    println()
    tank.fireAShot(tank.chargeWeapon(Ammunition.BLUE))
    println()
    tank.fireAShot(tank.chargeWeapon(Ammunition.GREEN))
    println()
    tank.fireAShot(tank.chargeWeapon(Ammunition.RED))
}

enum class Ammunition(val damage: Int? = null) {
    BLUE(5),
    GREEN(10),
    RED(20),
    NOTHING()
}

class Tank(
    private val name: String,
    private val health: Int,
) {

    fun chargeWeapon(newAmmunition: Ammunition): Int? {
        when (newAmmunition) {
            Ammunition.BLUE -> {
                println("Заряжен ${Ammunition.BLUE.name} снаряд с уроном ${Ammunition.BLUE.damage}.")
                return Ammunition.BLUE.damage
            }

            Ammunition.GREEN -> {
                println("Заряжен ${Ammunition.GREEN.name} снаряд с уроном ${Ammunition.GREEN.damage}.")
                return Ammunition.GREEN.damage
            }

            Ammunition.RED -> {
                println("Заряжен ${Ammunition.RED.name} снаряд с уроном ${Ammunition.RED.damage}.")
                return Ammunition.RED.damage
            }

            else -> {
                return null
            }
        }
    }

    fun fireAShot(damage: Int?) {
        if (damage == null) println("Не заряжен.") else println("Произведен выстрел с уроном $damage")
    }
}
package lesson_14

fun main() {

    val liner = LinerShip()
    liner.showShipInformation()
    println()
    val cargoShip = CargoShip()
    cargoShip.showShipInformation()
    println()
    val icebreaker = IcebreakerShip()
    icebreaker.showShipInformation()

}

open class LinerShip(
    val name: String = "Лайнер",
    val speed: Int = 25,
    val numberOfPassengers: Int = 3000,
    val shipTonnage: Int = 15_000,
) {
    open fun showShipInformation() {
        println(
            """
            Название корабля: $name
            Скорость корабля: $speed узлов
            Кол-во пассажиров: $numberOfPassengers чел.
            Грузоподъемность: $shipTonnage т
        """.trimIndent()
        )
    }
}

class CargoShip(
    name: String = "Грузовой корабль",
    speed: Int = 20,
    numberOfPassengers: Int = 50,
    shipTonnage: Int = 20_000,
) : LinerShip(name, speed, numberOfPassengers, shipTonnage)

class IcebreakerShip(
    name: String = "Ледокол",
    speed: Int = 18,
    numberOfPassengers: Int = 150,
    shipTonnage: Int = 10_000,
    val isCanCrackIce: Boolean = true,
) : LinerShip(name, speed, numberOfPassengers, shipTonnage) {
    override fun showShipInformation() {
        super.showShipInformation()
        println("Возможность колоть лед: $isCanCrackIce")
    }
}
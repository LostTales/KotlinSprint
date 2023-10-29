package lesson_14

fun main() {

    val liner = LinerShip2()
    liner.showShipInformation2()
    liner.activateShipLoading()
    println()
    val cargoShip = CargoShip2()
    cargoShip.showShipInformation2()
    cargoShip.activateShipLoading()
    println()
    val icebreaker = IcebreakerShip2()
    icebreaker.showShipInformation2()
    icebreaker.activateShipLoading()

}

open class LinerShip2(
    val name: String = "\"Лайнер\"",
    val speed: Int = 25,
    val numberOfPassengers: Int = 3000,
    val shipTonnage: Int = 15_000,
) {
    open fun showShipInformation2() {
        println(
            """
            Название корабля: $name
            Скорость корабля: $speed узлов
            Кол-во пассажиров: $numberOfPassengers чел.
            Грузоподъемность: $shipTonnage т
        """.trimIndent()
        )
    }

    open fun activateShipLoading() {
        println("На корабле $name выдвинут горизонтальный трап.")
    }
}

class CargoShip2(
    name: String = "\"Грузовой корабль\"",
    speed: Int = 20,
    numberOfPassengers: Int = 50,
    shipTonnage: Int = 20_000,
) : LinerShip2(name, speed, numberOfPassengers, shipTonnage) {

    override fun activateShipLoading() {
        println("На корабле $name активирован погрузочный кран.")
    }
}

class IcebreakerShip2(
    name: String = "\"Ледокол\"",
    speed: Int = 18,
    numberOfPassengers: Int = 150,
    shipTonnage: Int = 10_000,
    val isCanCrackIce: Boolean = true,
) : LinerShip2(name, speed, numberOfPassengers, shipTonnage) {
    override fun showShipInformation2() {
        super.showShipInformation2()
        println("Возможность колоть лед: $isCanCrackIce")
    }

    override fun activateShipLoading() {
        println("На корабле $name открыты ворота со стороны кормы.")
    }

}
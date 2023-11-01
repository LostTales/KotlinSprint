package lesson_15

fun main() {

    val crucian = Fish("Карась")
    crucian.swim()
    crucian.movementUp()
    crucian.movementDown()
    crucian.reversal()
    crucian.movementInPlace()

    println()

    val seagull = Bird("Чайка")
    seagull.flewUp()
    seagull.flewDown()
    seagull.landOnTheWater()
    seagull.swim()
    seagull.doveIntoWater()

    println()

    val duck = Bird("Утка")
    duck.flewUp()
    duck.flewDown()
    duck.landOnTheWater()
    duck.swim()
    duck.doveIntoWater()

}

interface Flyable {

    val name: String

    fun flewUp() = println("$name полет вверх.")
    fun flewDown() = println("$name полет вниз.")
    fun landOnTheWater() = println("$name посадка на воду.")
    fun doveIntoWater() = println("$name нырнуть в воду.")

}

interface Swimmable {

    val name: String
    fun swim() = println("$name плывет.")

    fun movementUp() = println("$name плывет вверх.")

    fun movementDown() = println("$name плывет вниз.")

    fun reversal() = println("Разворот $name в воде.")

    fun movementInPlace() = println("Движение в воде $name на месте.")

}

class Fish(_name: String) : Swimmable {
    override val name = _name
}

class Bird(_name: String) : Flyable, Swimmable {
    override val name = _name
}
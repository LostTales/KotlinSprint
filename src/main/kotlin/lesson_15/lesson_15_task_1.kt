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
    seagull.swimOnTheWater()
    seagull.doveIntoWater()

    println()

    val duck = Bird("Утка")
    duck.flewUp()
    duck.flewDown()
    duck.swimOnTheWater()
    duck.doveIntoWater()

}

interface MoveFish {

    val name: String
    fun swim() {
        println("Рыба $name плывет.")
    }

    fun movementUp() {
        println("Рыба $name плывет вверх.")
    }

    fun movementDown() {
        println("Рыба $name плывет вниз.")
    }

    fun reversal() {
        println("Разворот рыбы $name.")
    }

    fun movementInPlace() {
        println("Движение рыбы $name на месте.")
    }

}

interface MoveBird {

    val name: String

    fun flewUp() = println("Птица $name полетела вверх.")
    fun flewDown() = println("Птица $name полетела вниз.")
    fun swimOnTheWater() = println("Птица $name плывет по воде.")
    fun doveIntoWater() = println("Птица $name нырнула в воду.")

}

class Fish(_name: String) : MoveFish {
    override val name = _name
}

class Bird(_name: String) : MoveBird {
    override val name = _name
}
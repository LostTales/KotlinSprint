package lesson_16


import kotlin.math.PI
import kotlin.math.floor
import kotlin.math.pow

fun main() {

    val circle = Circle2(10)
    circle.calculatePerimeter()
    circle.calculateArea()
}

class Circle2(
    private val radius: Int,
) {

    private val numberPi: Double = floor(PI * NUMBER_100) / NUMBER_100

    fun calculateArea(): Int {
        val result = Math.round(numberPi * radius.toDouble().pow(NUMBER_TWO)).toInt()
        println("Площадь круга S = $result")
        return result
    }

    fun calculatePerimeter(): Int {
        val result = (Math.round(NUMBER_TWO * numberPi * radius)).toInt()
        println("Периметр круга P = $result")
        return result
    }
}

const val NUMBER_TWO = 2
const val NUMBER_100 = 100
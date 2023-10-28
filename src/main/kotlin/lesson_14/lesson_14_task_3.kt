package lesson_14

import kotlin.math.pow

fun main() {
    val circle1 = Circle(10, "черный")
    circle1.calculateArea()
    circle1.calculatePerimeter()
    println()
    val circle2 = Circle(20, "белый")
    circle2.calculateArea()
    circle2.calculatePerimeter()
    println()
    val rectangle1 = Rectangle(5, 15, "черный")
    rectangle1.calculateArea()
    rectangle1.calculatePerimeter()
    println()
    val rectangle2 = Rectangle(15, 25, "белый")
    rectangle2.calculateArea()
    rectangle2.calculatePerimeter()
    println()

    val listFigures = mutableListOf<Figure>()
    listFigures.add(circle1)
    listFigures.add(circle2)
    listFigures.add(rectangle1)
    listFigures.add(rectangle2)

    var sumPerimetersBlackFigure: Int = 0
    var sumAreaWhiteFigure: Int = 0

    listFigures.forEach { if (it.color == "черный") sumPerimetersBlackFigure += it.calculatePerimeter() }
    listFigures.forEach { if (it.color == "белый") sumAreaWhiteFigure += it.calculateArea() }
    println()

    println(
        """
        Cумма периметров всех черных фигур: $sumPerimetersBlackFigure
        Cумма площадей всех белых фигур: $sumAreaWhiteFigure
    """.trimIndent()
    )

}

abstract class Figure {
    abstract val color: String
    abstract fun calculateArea(): Int
    abstract fun calculatePerimeter(): Int
}

class Circle(
    val radius: Int,
    override val color: String,
) : Figure() {
    override fun calculateArea(): Int {
        val result = Math.round(NUMBER_PI * radius.toDouble().pow(NUMBER_2)).toInt()
        println("Площадь круга S = $result")
        return result
    }

    override fun calculatePerimeter(): Int {
        val result = (Math.round(NUMBER_2 * NUMBER_PI * radius)).toInt()
        println("Периметр круга P = $result")
        return result
    }

}

class Rectangle(
    val width: Int,
    val height: Int,
    override val color: String,
) : Figure() {
    override fun calculateArea(): Int {
        val result = width * height
        println("Площадь прямоугольника S = $result")
        return result
    }

    override fun calculatePerimeter(): Int {
        val result = NUMBER_2 * (width + height)
        println("Периметр прямоугольника P = $result")
        return result
    }
}

const val NUMBER_2 = 2
const val NUMBER_PI = 3.14
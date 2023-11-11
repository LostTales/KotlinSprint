package lesson_18

import kotlin.math.pow

fun main() {

    val package1: PackageShape = PackageShapeRectangle(7.55, 4.0, 5.7)
    val package2: PackageShape = PackageShapeCube(10.5)

    val allPackage = listOf<PackageShape>(package1, package2)
    allPackage.forEach { it.calculatePackageArea() }
}

open class PackageShape {
    open fun calculatePackageArea() = 0.0
}

class PackageShapeRectangle(
    private val length: Double,
    private val width: Double,
    private val height: Double,
) : PackageShape() {

    override fun calculatePackageArea(): Double {
        val result = NUMBER_TWO * Math.round((length * width + length * height + width * height)).toDouble()
        println("Площадь прямоугольного параллелепипеда S = $result")
        return result
    }
}

class PackageShapeCube(
    private val edgeLength: Double,
) : PackageShape() {

    override fun calculatePackageArea(): Double {
        val result = Math.round(NUMBER_SIX * edgeLength.pow(NUMBER_TWO)).toDouble()
        println("Площадь куба S = $result")
        return result
    }
}

private const val NUMBER_TWO = 2
private const val NUMBER_SIX = 6
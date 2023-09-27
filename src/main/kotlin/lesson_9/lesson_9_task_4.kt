package lesson_9

fun main() {

    println("Введите пять ингредиентов через запятую:")

    val listOfIngredients2 = readln().split(",").toMutableList()

    println(listOfIngredients2.joinToString())

    listOfIngredients2.sort()

    println(listOfIngredients2.joinToString())

}
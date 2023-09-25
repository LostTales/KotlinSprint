package lesson_8

fun main() {

    println("Введите кол-во ингредиентов:")
    val numberOfIngredients = Array(readln().toInt()) { "" }

    var number = 0

    for (i in 0 until numberOfIngredients.size) {
        println("Введите название ${++number}-го ингредиента:")
        numberOfIngredients[i] = readln()
    }

    println("Список ингредиентов:")
    for (i in numberOfIngredients) {
        println(i)
    }

}
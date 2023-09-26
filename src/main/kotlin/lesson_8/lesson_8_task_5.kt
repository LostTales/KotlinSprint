package lesson_8

fun main() {

    println("Введите кол-во ингредиентов:")
    var counter = 0
    val number = readln().toInt()
    val numberOfIngredients = Array(number) {
        println("Введите название ${++counter}-го ингредиента:")
        readln()
    }

    println("Список ингредиентов:")
    for (i in numberOfIngredients) {
        println(i)
    }

}
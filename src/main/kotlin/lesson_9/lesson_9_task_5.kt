package lesson_9

import java.util.*

fun main() {

    var counter = 0

    val listOfIngredients = MutableList(5) {
        println("Введите название ${++counter} ингредиента:")
        readln()
    }

    listOfIngredients.sort()

    println("${
        listOfIngredients.joinToString()
            .replaceFirstChar { it.titlecase() }
    }."
    )

}
package lesson_20

fun main() {

    val listOfElements = listOf("element1", "element2", "element3", "element4", "element5", "element6")
    val listOfLambdas = listOfElements.map { { println("Нажат элемент [$it]") }() }
    println()
    val newListOfLambdas =
        listOfElements.filterIndexed { index, _ -> (index + 1) % 2 == 0 }.map { { println("Нажат элемент [$it]") }() }
}
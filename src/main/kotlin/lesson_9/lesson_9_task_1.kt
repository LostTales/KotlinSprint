package lesson_9

fun main() {

    val ingredientsForPancakes = listOf(
        "молоко", "вода", "яйца", "сахар", "соль", "мука",
        "масло растительное", "масло сливочное"
    )

    println("В рецепте есть следующие ингредиенты:")
    ingredientsForPancakes.forEach { println("[$it]") }

}
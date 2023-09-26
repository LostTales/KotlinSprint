package lesson_8

fun main() {

    val ingredientsForPancakes = arrayOf(
        "молоко", "вода", "яйца", "сахар", "соль", "мука",
        "масло растительное", "масло сливочное"
    )
    println("Введите название ингредиента:")
    val findIngredient = readln()

    for (i in ingredientsForPancakes.indices) {
        if (findIngredient == ingredientsForPancakes[i]) {
            println("Ингредиент [$findIngredient] в рецепте есть")
            return
        } else {
            continue
        }
    }

    println("Такого ингредиента в рецепте нет")

}
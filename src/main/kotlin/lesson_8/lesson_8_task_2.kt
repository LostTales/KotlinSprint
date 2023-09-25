package lesson_8

fun main() {

    val ingredientsForPancakes = arrayOf(
        "молоко", "вода", "яйца", "сахар", "соль", "мука",
        "масло растительное", "масло сливочное"
    )
    println("Введите название ингредиента:")
    val findIngredient = readln()

    for (i in ingredientsForPancakes) {
        if (findIngredient in ingredientsForPancakes) {
            println("Ингредиент [$findIngredient] в рецепте есть")
            break
        } else {
            println("Такого ингредиента в рецепте нет")
            break
        }
    }
}
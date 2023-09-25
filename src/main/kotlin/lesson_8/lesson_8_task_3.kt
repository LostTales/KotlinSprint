package lesson_8

fun main() {

    val ingredientsForPancakes = arrayOf(
        "молоко", "вода", "яйца", "сахар", "соль", "мука",
        "масло растительное", "масло сливочное"
    )
    println("Кол-во ингредиентов ${ingredientsForPancakes.size}")
    println("Введите название ингредиента:")
    val search = when (val findIngredient = readln()) {
        ingredientsForPancakes[0] -> "Ингредиент [$findIngredient] в рецепте есть"
        ingredientsForPancakes[1] -> "Ингредиент [$findIngredient] в рецепте есть"
        ingredientsForPancakes[2] -> "Ингредиент [$findIngredient] в рецепте есть"
        ingredientsForPancakes[3] -> "Ингредиент [$findIngredient] в рецепте есть"
        ingredientsForPancakes[4] -> "Ингредиент [$findIngredient] в рецепте есть"
        ingredientsForPancakes[5] -> "Ингредиент [$findIngredient] в рецепте есть"
        ingredientsForPancakes[6] -> "Ингредиент [$findIngredient] в рецепте есть"
        ingredientsForPancakes[7] -> "Ингредиент [$findIngredient] в рецепте есть"
        else -> {
            "Такого ингредиента в рецепте нет"
        }
    }
    println(search)

}
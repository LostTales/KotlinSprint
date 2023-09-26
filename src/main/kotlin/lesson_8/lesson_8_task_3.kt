package lesson_8

fun main() {

    val ingredientsForPancakes = arrayOf(
        "молоко", "вода", "яйца", "сахар", "соль", "мука",
        "масло растительное", "масло сливочное"
    )
    println("Кол-во ингредиентов ${ingredientsForPancakes.size}")

    println("Введите название ингредиента:")
    val findIngredient = readln()

    val search = if (findIngredient in ingredientsForPancakes) {
        "Ингредиент [$findIngredient] в рецепте есть"
    } else {
        "Такого ингредиента в рецепте нет"
    }
    println(search)

}
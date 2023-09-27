package lesson_8

fun main() {

    val ingredientsForPancakes = arrayOf(
        "молоко", "вода", "яйца", "сахар", "соль", "мука",
        "масло растительное", "масло сливочное"
    )

    println("Список ингредиентов:")
    for (i in ingredientsForPancakes) {
        println(i)
    }

    println("Введите название заменяемого ингредиента:")
    val findIngredient = readln()

    if (findIngredient in ingredientsForPancakes) {
        println("Ингредиент [$findIngredient] в рецепте есть")
        val index = ingredientsForPancakes.indexOf(findIngredient)
        println("Введите новый ингредиент:")
        val replaceIngredient = readln()
        for (i in ingredientsForPancakes.indices) {
            if (findIngredient in ingredientsForPancakes) ingredientsForPancakes[index] = replaceIngredient
            break
        }
    } else {
        println("Такого ингредиента в рецепте нет")
        return
    }

    println("Готово! Вы сохранили следующий список:")
    for (i in ingredientsForPancakes) {
        println(i)
    }

}
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

    for (i in ingredientsForPancakes) {
        if (findIngredient in ingredientsForPancakes) {
            println("Ингредиент [$findIngredient] в рецепте есть")
            break
        } else {
            println("Такого ингредиента в рецепте нет")
            return
        }
    }

    val index = ingredientsForPancakes.indexOf(findIngredient)

    println("Введите новый ингредиент:")
    val replaceIngredient = readln()

    for (i in 0 until ingredientsForPancakes.size) {
        if (findIngredient in ingredientsForPancakes) ingredientsForPancakes[index] = replaceIngredient
        break
    }

    println("Готово! Вы сохранили следующий список:")
    for (i in ingredientsForPancakes) {
        println(i)
    }

}
package lesson_11

fun main() {

    val screen = Screen2()

    val mushroomBurgerAndCheese = Dish(
        id = 1,
        imageDish = "burgerImage.jpg",
        nameDish = "БУРГЕР С ГРИБАМИ\nИ СЫРОМ",
        ingredients = listOf("ТВОРОГ", "КУРИНОЕ ЯЙЦО", "ПШЕНИЧНАЯ МУКА", "ПОДСОЛНЕЧНОЕ МАСЛО"),
        numberOfIngredients = listOf(350, 6, 12, 5),
        unitsOfMeasurement = listOf("Г", "ШТУКИ", "ЛОЖЕК", "ЛОЖЕК"),
        portions = 3,
    )

    val classicHamburger = Dish(
        id = 2,
        imageDish = "classicHamburgerImage.jpg",
        nameDish = "КЛАССИЧЕСКИЙ ГАМБУРГЕР",
        ingredients = listOf("ТВОРОГ", "КУРИНОЕ ЯЙЦО", "ПШЕНИЧНАЯ МУКА", "ПОДСОЛНЕЧНОЕ МАСЛО", "СЫР"),
        numberOfIngredients = listOf(350, 6, 12, 5, 100),
        unitsOfMeasurement = listOf("Г", "ШТУКИ", "ЛОЖЕК", "ЛОЖЕК", "Г"),
        portions = 2,
    )

    val cheeseburger = Dish(
        id = 3,
        imageDish = "cheeseburgerImage.jpg",
        nameDish = "ЧИЗБУРГЕР",
        ingredients = listOf("ТВОРОГ", "КУРИНОЕ ЯЙЦО", "ПШЕНИЧНАЯ МУКА", "ПОДСОЛНЕЧНОЕ МАСЛО", "СЫР"),
        numberOfIngredients = listOf(350, 6, 12, 5, 200),
        unitsOfMeasurement = listOf("Г", "ШТУКИ", "ЛОЖЕК", "ЛОЖЕК", "Г"),
        portions = 1,
    )

    val burgerCategory = Category(
        imageCategory = "burgerImage.jpg",
        nameCategory = "БУРГЕРЫ",
        shortDescriptionCategory = "Рецепты всех\nпопулярных видов\nбургеров",
        dish = mutableListOf(),
    )

    val dessertsCategory = Category(
        imageCategory = "dessertsImage.jpg",
        nameCategory = "ДЕСЕРТЫ",
        shortDescriptionCategory = "Самые вкусные\nрецепты десертов\nспециально для вас",
        dish = mutableListOf(),
    )

    val pizzaCategory = Category(
        imageCategory = "pizzaImage.jpg",
        nameCategory = "ПИЦЦА",
        shortDescriptionCategory = "Пицца на любой вкус\nи цвет. Лучшая\nподборка для тебя",
        dish = mutableListOf(),
    )

    val fishDishesCategory = Category(
        imageCategory = "fishDishesImage.jpg",
        nameCategory = "БЛЮДА ИЗ РЫБЫ",
        shortDescriptionCategory = "Печеная, жареная,\nсушеная, любая рыба\nна твой вкус",
        dish = mutableListOf(),
    )

    val soupCategory = Category(
        imageCategory = "soupImage.jpg",
        nameCategory = "СУП",
        shortDescriptionCategory = "От классики до\nэкзотики: мир в одной\nтарелке",
        dish = mutableListOf(),
    )

    val saladsCategory = Category(
        imageCategory = "saladsImage.jpg",
        nameCategory = "САЛАТЫ",
        shortDescriptionCategory = "Хрустящий\nкалейдоскоп под\nсоусом вдохновения",
        dish = mutableListOf(),
    )

    val inFavorites = InFavorites(mutableListOf())

    screen.createScreen2()
    println()

    mushroomBurgerAndCheese.printDish()
    println()

    screen.turnToAnotherPage()
    println()

    mushroomBurgerAndCheese.addOrRemoveFromFavorites(true)
    classicHamburger.addOrRemoveFromFavorites(true)
    cheeseburger.addOrRemoveFromFavorites(true)
    println()

    screen.turnToAnotherPage()
    println()

    inFavorites.addToFavorites(mushroomBurgerAndCheese)
    inFavorites.addToFavorites(classicHamburger)
    inFavorites.addToFavorites(cheeseburger)

    inFavorites.pintInFavorites()
    println()

    screen.turnToAnotherPage()
    println()

    burgerCategory.addCategory(mushroomBurgerAndCheese)
    burgerCategory.addCategory(classicHamburger)
    burgerCategory.addCategory(cheeseburger)
    println()

    screen.turnToAnotherPage()
    println()

    burgerCategory.printCategory()
    println()

    screen.turnToAnotherPage()
    println()

    addAndPrintAllCategory(burgerCategory)
    println()
    addAndPrintAllCategory(dessertsCategory)
    println()
    addAndPrintAllCategory(pizzaCategory)
    println()
    addAndPrintAllCategory(fishDishesCategory)
    println()
    addAndPrintAllCategory(soupCategory)
    println()
    addAndPrintAllCategory(saladsCategory)
    println()

    screen.stopScreen2()

}

class Screen2() {
    fun createScreen2() = println("Приветственный экран с логотипом")

    fun turnToAnotherPage() = println("Перейти на другую страничку")

    fun stopScreen2() = println("Экран закрыт")
}

class Dish(
    val id: Int,
    val imageDish: String,
    val nameDish: String,
    val ingredients: List<String>,
    var numberOfIngredients: List<Int>,
    val unitsOfMeasurement: List<String>,
    val portions: Int,
    var inFavorites: Boolean = false,
) {

    fun printDish() {
        val newNumberOfIngredients = numberOfIngredients.map { it * portions }
        val print = """
            |$nameDish
            
            |ИНГРЕДИЕНТЫ
            |Порции: $portions                    
                        
        """.trimMargin()
        println(print)

        ingredients.forEachIndexed { index, value ->
            println("$value ${newNumberOfIngredients[index]} ${unitsOfMeasurement[index]}")
        }
    }

    fun addOrRemoveFromFavorites(userPick: Boolean): Boolean {
        if (userPick) {
            inFavorites = true
            println("Блюдо $nameDish добавлено в избранное")
        } else {
            inFavorites = false
            println("Блюдо $nameDish удалено из избранного")
        }
        return inFavorites
    }

}

class InFavorites(
    var inFavoritesDish: MutableList<Dish>
) {

    fun addToFavorites(dishAddInFavorites: Dish) {
        if (dishAddInFavorites.inFavorites) {
            inFavoritesDish.add(dishAddInFavorites)
        }
    }

    fun removeFromFavorites(dishRemoveInFavorites: Dish) {
        if (dishRemoveInFavorites.inFavorites) {
            println("Блюдо ${dishRemoveInFavorites.nameDish} удалено из избранного")
            inFavoritesDish.remove(dishRemoveInFavorites)
        }
    }

    fun pintInFavorites() {
        println("ИЗБРАННОЕ")
        inFavoritesDish.forEach { println("${it.imageDish}\n${it.nameDish}") }
    }

}

class Category(
    val imageCategory: String,
    val nameCategory: String,
    val shortDescriptionCategory: String,
    var dish: MutableList<Dish>,
) {

    fun addCategory(dishAdd: Dish) {
        dish.add(dishAdd)
        println("Блюдо ${dishAdd.nameDish} добавлено в категорию ${nameCategory}.")
    }

    fun removeCategory(dishRemove: Dish) {
        dish.remove(dishRemove)
        println("Блюдо ${dishRemove.nameDish} удалено из категории ${nameCategory}.")
    }

    fun printCategory() {
        println(nameCategory)
        dish.forEach { println("${it.imageDish}\n${it.nameDish}") }
    }

}

fun addAndPrintAllCategory(categoryAdd: Category) {
    val allCategory = mutableListOf<Category>()
    allCategory.add(categoryAdd)
    allCategory.forEach {
        println(
            "${it.imageCategory}\n${it.nameCategory}\n" +
                    "${it.shortDescriptionCategory}"
        )
    }
}

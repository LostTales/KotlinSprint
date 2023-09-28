package lesson_9

fun checklist(content: MutableList<String>) {
    content.forEach { println("[$it]") }
}

fun main() {

    val tea = mutableListOf("вода", "чай", "сахар")

    println("В рецепте есть базовые ингредиенты:")
    checklist(tea)

    println("Желаете добавить ещё?")
    val userAnswer = readln()

    if (userAnswer == ANSWER) {
        println(
            "Какой ингредиент вы хотите добавить?" +
                    "\n(сначала введите порядковый номер от 0 до 3, затем сам ингредиент)"
        )
        tea.add(readln().toInt(), readln())
    } else {
        return
    }

    println("Теперь в рецепте есть следующие ингредиенты:")
    checklist(tea)

}

const val ANSWER = "да"
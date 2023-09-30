package lesson_9

import java.util.*

fun checklist(content: MutableList<String>) {
    content.forEach { println("[$it]") }
}

fun main() {

    val tea = mutableListOf("вода", "чай", "сахар")

    println("В рецепте есть базовые ингредиенты:")
    checklist(tea)

    println("Желаете добавить ещё?")
    val userAnswer = readln().lowercase()

    if (userAnswer == ANSWER) {
        println("Какой ингредиент вы хотите добавить?")
        tea.add(readln())
    } else {
        return
    }

    println("Теперь в рецепте есть следующие ингредиенты:")
    checklist(tea)

}

const val ANSWER = "да"
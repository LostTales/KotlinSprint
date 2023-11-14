package lesson_21


fun main() {

    val listOfNumbers = listOf(7, 15, 10, 3, 22, 100)
    println(listOfNumbers.evenNumbersSum())
}

fun List<Int>.evenNumbersSum() = this.filter { it -> (it % 2) == 0 }.sum()
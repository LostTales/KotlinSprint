package lesson_21


fun main() {

    val listOfNumbers = listOf(7, 15, 10, 3, 22, 100)
    listOfNumbers.evenNumbersSum()
}

fun List<Int>.evenNumbersSum(): Int {

    var sumOfEvenNumbers = 0

    this.forEach {
        if (it % 2 == 0) sumOfEvenNumbers += it
    }

    println(sumOfEvenNumbers)

    return sumOfEvenNumbers
}
package lesson_21

fun main() {

    val someString = "hello"
    someString.vowelCount()
}

fun String.vowelCount(): Int {

    var numberOfVowels = 0

    this.forEach {
        when (it) {
            'a', 'e', 'i', 'o', 'u' -> numberOfVowels++
        }
    }
    println(numberOfVowels)
    return numberOfVowels
}
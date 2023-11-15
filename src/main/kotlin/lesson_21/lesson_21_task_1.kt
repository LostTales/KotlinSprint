package lesson_21


fun main() {

    val someString = "hello"
    println(someString.vowelCount())
}

fun String.vowelCount() = this.count { it -> it in "aeiou" }
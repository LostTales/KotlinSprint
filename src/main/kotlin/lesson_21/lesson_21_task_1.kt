package lesson_21


fun main() {

    val someString = "hello"
    println(someString.vowelCount())
}

fun String.vowelCount() = this.count { it ->
    (it == 'a') || (it == 'e') || (it == 'i') || (it == 'o') || (it == 'u')
}

package lesson_10

fun main() {

    println("Задайте длину пароля:")
    generatePassword1(readln().toInt())

}

fun generatePassword1(passwordLength: Int) {

    val specialChars = ' '..'/'
    val digits = '0'..'9'
    var password: String = ""

    for (i in 1..passwordLength) {
        password += if (i % 2 != 0) {
            specialChars.random()
        } else {
            digits.random()
        }
    }
    println("Пароль:\n$password")

}
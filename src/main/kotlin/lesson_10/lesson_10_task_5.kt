package lesson_10


fun main() {

    println("Введите логин:")
    val userLoginRegistration = readln()
    val userRegistration = findLength(userLoginRegistration)

    if (userRegistration >= 4) {
        println("Задайте длину пароля:")
    } else {
        println("Логин недостаточно длинный.")
        return
    }

    val userPasswordRegistration = generatePassword(readln().toInt())
    println("Пароль:\n$userPasswordRegistration")

    println("Авторизация:")

    println(LOGIN_REQUEST_1)
    val userLogin = readln()

    val loginVerification = if (userLogin == userLoginRegistration) {
        PASSWORD_REQUEST_1
    } else {
        println("Пройдите регистрацию.")
        return
    }
    println(loginVerification)

    do {
        val userPassword = readln()
        authorization(userPassword, userPasswordRegistration)
    } while (userPassword != userPasswordRegistration)

    do {
        val code = (1000..9999).random()
        println("Ваш код авторизации: $code")
        println("Введите код:")
        val userAnswer = readln().toInt()
        if (userAnswer != code) println("Неверный код.")
    } while (userAnswer != code)

    println("Добро пожаловать!")

}

const val LOGIN_REQUEST_1 = "Введите логин:"
const val PASSWORD_REQUEST_1 = "Введите пароль:"

fun findLength(login: String): Int {

    return login.length

}

fun generatePassword(passwordLength: Int): String {

    val specialChars = listOf('!', '"', '#', '$', '%', '&', "'", '(', ')', '*', '+', ',', '-', '.', '/', ' ')
    val digits = '0'..'9'
    var password: String = ""

    for (i in 1..passwordLength) {
        password += if (i % 2 != 0) {
            specialChars.random()
        } else {
            digits.random()
        }
    }
    return password

}

fun authorization(userPassword: String, userPasswordRegistration: String) {

    if (userPassword == userPasswordRegistration) {
        println("Авторизация прошла успешно")
    } else {
        println("Неверный пароль\n${PASSWORD_REQUEST_1}")
    }
}
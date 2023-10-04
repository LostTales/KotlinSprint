package lesson_10


fun main() {

    println("Регистрация:")

    val userLoginRegistration = registerLogin()

    val userPasswordRegistration = registerPassword()

    println("Авторизация:")

    perfomAuthorization(userLoginRegistration, userPasswordRegistration)

}

fun registerLogin(): String {

    println(LOGIN_REQUEST_1)
    var userLoginRegistration = readln()
    while (!findLength(userLoginRegistration)) {
        println("Логин недостаточно длинный.\n$LOGIN_REQUEST_1")
        userLoginRegistration = readln()
    }
    return userLoginRegistration

}

fun registerPassword(): String {

    println("Задайте длину пароля:")
    val userPasswordRegistration = generatePassword(readln().toInt())
    println("Пароль:\n$userPasswordRegistration")
    return userPasswordRegistration

}

fun findLength(login: String) = login.length >= LOGIN_LENGHT

fun generatePassword(passwordLength: Int): String {

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
    return password

}

fun authorization(userPassword: String, userPasswordRegistration: String) {

    if (userPassword == userPasswordRegistration) {
        println("Авторизация прошла успешно")
    } else {
        println("Неверный пароль\n${PASSWORD_REQUEST_1}")
    }

}

fun perfomAuthorization(userLoginRegistration: String, userPasswordRegistration: String) {

    do {
        println(LOGIN_REQUEST_1)
        val userLogin = readln()
        if (userLogin == userLoginRegistration) println(PASSWORD_REQUEST_1)
        else println("Неверный логин.")
    } while (userLogin != userLoginRegistration)

    do {
        val userPassword = readln()
        authorization(userPassword, userPasswordRegistration)
    } while (userPassword != userPasswordRegistration)

    do {
        val code = (1000..9999).random().toString()
        println("Ваш код авторизации: $code")
        println("Введите код:")
        val userAnswer = readln()
        if (userAnswer != code) println("Неверный код.")
    } while (userAnswer != code)

    println("Добро пожаловать!")

}

const val LOGIN_REQUEST_1 = "Введите логин:"
const val PASSWORD_REQUEST_1 = "Введите пароль:"
const val LOGIN_LENGHT = 4
package lesson_6

var userPasswordRegistration: String = ""
var userPassword: String = ""

fun authorization() {

    if (userPassword == userPasswordRegistration) {
        println("Авторизация прошла успешно")
    } else {
        println("Неверный пароль\n$PASSWORD_REQUEST")
        userPassword = readln()
    }
    if (userPassword == userPasswordRegistration) {
        println("Авторизация прошла успешно")
    }
}

fun main() {

    println("Пройдите регистрацию: создайте логин и пароль\n$LOGIN_REQUEST")
    val userLoginRegistration = readln()
    println(PASSWORD_REQUEST)
    userPasswordRegistration = readln()

    println(LOGIN_REQUEST)
    val userLogin = readln()

    val loginVerification = if (userLogin == userLoginRegistration) {
        PASSWORD_REQUEST
    } else {
        println("Пройдите регистрацию.")
        return
    }
    println(loginVerification)

    userPassword = readln()

    do {
        authorization()
    } while (userPassword != userPasswordRegistration)

}

const val LOGIN_REQUEST = "Введите логин:"
const val PASSWORD_REQUEST = "Введите пароль:"
package lesson_6

fun authorization(userPassword: String, userPasswordRegistration: String) {

    if (userPassword == userPasswordRegistration) {
        println("Авторизация прошла успешно")
    } else {
        println("Неверный пароль\n$PASSWORD_REQUEST")
    }
}

fun main() {

    println("Пройдите регистрацию: создайте логин и пароль\n$LOGIN_REQUEST")
    val userLoginRegistration = readln()
    println(PASSWORD_REQUEST)
    val userPasswordRegistration = readln()

    println(LOGIN_REQUEST)
    val userLogin = readln()

    val loginVerification = if (userLogin == userLoginRegistration) {
        PASSWORD_REQUEST
    } else {
        println("Пройдите регистрацию.")
        return
    }
    println(loginVerification)

    do {
        val userPassword = readln()
        authorization(userPassword, userPasswordRegistration)
    } while (userPassword != userPasswordRegistration)

}

const val LOGIN_REQUEST = "Введите логин:"
const val PASSWORD_REQUEST = "Введите пароль:"
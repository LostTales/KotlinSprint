package lesson_6

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

    var userPassword = readln()

    fun authorization() {

        val authorization = if (userPassword == userPasswordRegistration) {

            println("Авторизация прошла успешно")

        } else {
            println("Неверный пароль")
        }
        println(authorization)
    }

    authorization()

    while (userPassword != userPasswordRegistration) {
        println(PASSWORD_REQUEST)
        userPassword = readln()
        authorization()
    }

}

const val LOGIN_REQUEST = "Введите логин:"
const val PASSWORD_REQUEST = "Введите пароль:"
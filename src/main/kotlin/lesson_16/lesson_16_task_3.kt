package lesson_16

import lesson_10.authorization
import sun.security.util.Password

fun main() {

    val user1 = NewUser()
    user1.enterLogin()
    println(user1.enterPassword("321k"))
}

class NewUser {

    var login: String = "user"
    private val password: String = "321k"

    fun enterLogin() {
        do {
            println(LOGIN_REQUEST_16)
            val actualPassword = readln()
            if (actualPassword != login) println("Неверный логин.")
        } while (actualPassword != login)
    }

    fun enterPassword(userPassword: String): String {

        println(PASSWORD_REQUEST_16)

        return if (userPassword != password) "Неверный пароль."
        else "Добро пожаловать!\nПароль: $userPassword"
    }
}

const val LOGIN_REQUEST_16 = "Введите логин:"
const val PASSWORD_REQUEST_16 = "Введите пароль:"
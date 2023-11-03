package lesson_16

import lesson_10.authorization
import sun.security.util.Password

fun main() {

    val user1 = NewUser()
    user1.enterLogin()
    user1.enterPassword("321k")
}

class NewUser {

    val login: String = "user"
    private val password: String = "321k"

    fun enterLogin() {
        do {
            println(LOGIN_REQUEST_16)
            val actualPassword = readln()
            if (actualPassword != login) println("Неверный логин.")
        } while (actualPassword != login)
    }

    fun enterPassword(userPassword: String): Unit {

        println(PASSWORD_REQUEST_16)

        return if (userPassword != password) println("Неверный пароль.")
        else println("Добро пожаловать!\nПароль: $userPassword")
    }
}

const val LOGIN_REQUEST_16 = "Введите логин:"
const val PASSWORD_REQUEST_16 = "Введите пароль:"
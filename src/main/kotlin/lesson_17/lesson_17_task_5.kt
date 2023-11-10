package lesson_17

import java.security.MessageDigest
import java.util.*

fun main() {

    val user1 = User17("user1", "4321k")

    user1.password = "k123"
    println(user1.password)
    user1.login = "user2"
    println(user1.login)
}

class User17(
    _login: String,
    _password: String,
) {

    var login = _login
        set(value) {
            println("Логин успешно изменен.")
            field = value
        }

    var password = _password
        get() {
            var hiddenPassword = ""
            for (i in 1..field.length) {
                hiddenPassword += "*"
            }
            return hiddenPassword
        }
        set(value) {
            val md = MessageDigest.getInstance("SHA-256")
            md.update(field.toByteArray())
            val digest = md.digest()
            val hashedPassword = Base64.getEncoder().encodeToString(digest)
            if (value != hashedPassword) {
                println("\"Вы не можете изменить пароль\"")
                println(hashedPassword)
            } else {
                val code = (1000..9999).random().toString()
                println("Ваш код авторизации: $code")
                println("Введите код:")
                val userAnswer = readln()
                if (userAnswer != code) {
                    println("Неверный код.")
                    return
                } else {
                    println("Принято.")
                }
            }
        }
}
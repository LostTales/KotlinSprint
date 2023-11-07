package lesson_17

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
            if (value != field) println("\"Вы не можете изменить пароль\"")
            field = password
        }
}
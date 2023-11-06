package lesson_16


fun main() {

    val user1 = NewUser("user", "321k")
    user1.loginVerification()
    println(user1.passwordVerification("321k"))
    println()
    val user2 = NewUser("user2", "1wer")
    user2.loginVerification()
    println(user2.passwordVerification("222"))
}

class NewUser(
    private var login: String,
    private val password: String,
) {

    fun loginVerification() {

        do {
            println(LOGIN_REQUEST)
            val actualPassword = readln()
            if (actualPassword != login) println(INCORRECT_LOGIN)
        } while (actualPassword != login)
    }

    fun passwordVerification(userPassword: String): String {

        println(PASSWORD_REQUEST)
        return if (userPassword != password) INCORRECT_PASSWORD
        else "$WELCOME\nПароль: $userPassword"
    }
}

private const val LOGIN_REQUEST = "Введите логин:"
private const val PASSWORD_REQUEST = "Введите пароль:"
private const val WELCOME = "Добро пожаловать!"
private const val INCORRECT_PASSWORD = "Неверный пароль."
private const val INCORRECT_LOGIN = "Неверный логин."
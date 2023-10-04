package lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {

    fun print() {
        println("$id\n$login\n$password\n$email")
    }
}
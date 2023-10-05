package lesson_11


fun main() {

    val user1 = User(
        id = 1,
        login = "Alex",
        password = "NHL2023",
        email = "alex@gmail.com"
    )

    val user2 = User(
        id = 2,
        login = "Olga",
        password = "NBA2023",
        email = "olga@gmail.com"
    )

    user1.print()
    println()
    user2.print()
}

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
package lesson_11

import java.rmi.AlreadyBoundException

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
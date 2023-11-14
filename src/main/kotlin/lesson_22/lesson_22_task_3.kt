package lesson_22

fun main() {

    val toys = Toys(1, "name", 175)

    val (id,name,number) = toys
    println(id)
    println(name)
    println(number)
}

data class Toys(
    val id: Int,
    val name: String,
    val number: Int,
)
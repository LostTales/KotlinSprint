package lesson_7

fun main() {

    val numbers1 = (0..9).random()
    val numbers2 = (0..9).random()
    val numbers3 = (0..9).random()
    val letters1 = ('a'..'z').random()
    val letters2 = ('a'..'z').random()
    val letters3 = ('a'..'z').random()

    println("$letters1$numbers1$letters2$numbers2$letters3$numbers3")
}
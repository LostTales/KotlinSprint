package lesson_22

fun main() {

    val regularBook1 = RegularBook("name1", "author1")
    val regularBook2 = RegularBook("name1", "author1")

    val dataBook1 = DataBook("name1", "author1")
    val dataBook2 = DataBook("name1", "author1")

    val newList = listOf(regularBook1, regularBook2, dataBook1, dataBook2)

    newList.forEach { println(regularBook1.equals(it)) }
    println()
    newList.forEach { println(regularBook2.equals(it)) }
    println()
    newList.forEach { println(dataBook1.equals(it)) }
    println()
    newList.forEach { println(dataBook2.equals(it)) }

}

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)
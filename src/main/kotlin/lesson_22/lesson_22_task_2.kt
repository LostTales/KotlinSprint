package lesson_22

fun main() {

    val regularBook1 = NewRegularBook("name1", "author1")
    val dataBook1 = NewDataBook("name1", "author1")

    println(regularBook1) /* TODO "стандартная реализация toString() вывела название с адресом/ссылкой объекта,
    для вывода свойств надо переопределить метод toString() или сделать data class */

    println(dataBook1) /* TODO toString() уже по умолчанию возвращает свойства,
    но мы также можем редактировать вывод - переопределить toString() */

}

class NewRegularBook(
    val name: String,
    val author: String,
)

data class NewDataBook(
    val name: String,
    val author: String,
) {
    override fun toString() = "name: $name\nauthor: $author"
}
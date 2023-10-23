package lesson_13


fun main() {
    val user1 = SubscriberData2("Ростислав", 89123456789)
    user1.printSubscriberData2()
}

class SubscriberData2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printSubscriberData2() {
        println("$name\n$phoneNumber\n${company ?: "<не указано>"}")
    }
}
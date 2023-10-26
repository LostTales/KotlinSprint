package lesson_13

fun main() {

    val contactList = mutableListOf<SubscriberData3>(
        SubscriberData3("Петр", 89123456789, "null"),
        SubscriberData3("Федр", 89123454321),
        SubscriberData3("Анна", 89123457721),
        SubscriberData3("Мария", 87163456789, "Ромашка"),
        SubscriberData3("Нина", 87163456755, "Гайка")
    )

    val usersCompany = mutableListOf<String>()

    contactList.forEach { it.company?.let { it1 -> usersCompany.add(it1) } }

    usersCompany.forEach { println(it) }
}

class SubscriberData3(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
}
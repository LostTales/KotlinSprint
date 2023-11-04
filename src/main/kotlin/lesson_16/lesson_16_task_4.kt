package lesson_16

fun main() {

    val order = Order()
    println(applicationToManager(true, order))
}

class Order {

    private val number: Int = 1
    var isReady: Boolean = false
}

fun applicationToManager(application: Boolean, order: Order): Boolean {
    order.isReady = application
    return application
}
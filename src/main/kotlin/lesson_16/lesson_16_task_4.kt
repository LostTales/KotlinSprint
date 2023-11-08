package lesson_16

fun main() {

    val order = Order(1)
    val messageToManager = applicationToManager(true, order)
    println(messageToManager)
}

class Order(
    private val number: Int,
    var isReady: Boolean = false,
) {

    fun changeOrderStatus(status: Boolean) {
        isReady = status
    }
}

fun applicationToManager(application: Boolean, order: Order): Boolean {
    order.changeOrderStatus(application)
    return application
}
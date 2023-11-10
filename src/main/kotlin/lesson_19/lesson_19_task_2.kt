package lesson_19

fun main() {

    val newProduct1 = NewProduct("рубашка", 1, Product.DRESSES)
    val newProduct2 = NewProduct("пылесос", 2, Product.DIFFERENT)

    newProduct1.getNewProduct()
    newProduct2.getNewProduct()
}

enum class Product {
    DRESSES,
    STATIONERY,
    DIFFERENT
}

fun showProduct(product: Product): String {

    return when (product) {
        Product.DRESSES -> "категория одежда"
        Product.STATIONERY -> "категория канцелярские товары"
        Product.DIFFERENT -> "категория разное"
    }
}

class NewProduct(
    private val name: String,
    private val id: Int,
    private val category: Product,
) {
    fun getNewProduct() {
        println("Товар $name id $id ${showProduct(category)}")
    }
}
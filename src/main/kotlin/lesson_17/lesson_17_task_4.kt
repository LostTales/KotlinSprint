package lesson_17

fun main() {

    val newPackage = NewPackage(1, "Boston")
    newPackage.location = "Detroit"
    println(newPackage.counter)
    newPackage.location = "Chicago"
    println(newPackage.counter)
    newPackage.location = "Chicago"
    println(newPackage.counter)
    newPackage.location = "Dallas"
    println(newPackage.counter)
    println()
    val newPackage2 = NewPackage(2, "Seattle")
    newPackage2.location = "Calgary"
    println(newPackage2.counter)
}

class NewPackage(

    val number: Int,
    _location: String,
) {
    var location = _location
        set(value) {
            if (value != field) ++counter
            field = value
        }

    var counter: Int = 0
}
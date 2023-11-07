package lesson_17


fun main() {

    val ship = NewShip("Avenger", 50, "Nassau")
    ship.name = "Revenge"
    println(ship.name)
}

class NewShip(

    _name: String,
    val averageSpeed: Int,
    var homePort: String,
) {

    var name = _name
        set(value) {
            if (value != field) println("Имя корабля $field неизменно.")
            field = name
        }
}
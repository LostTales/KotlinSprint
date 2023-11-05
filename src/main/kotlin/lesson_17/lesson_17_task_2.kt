package lesson_17

fun main() {

    val ship = NewShip()
    ship.name = "Revenge"
}

class NewShip {
    var name: String = "Avenger"
        set(value) {
            if (value != field) println("Имя корабля $field неизменно.")
            field = value
        }

    var averageSpeed: Int = 50
    var homePort: String = "Nassau"
}
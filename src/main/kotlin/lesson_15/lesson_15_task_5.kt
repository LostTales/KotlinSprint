package lesson_15

fun main() {

    val truck = Truck("truck", true, 0, 0.0)
    val passengerCar = PassengerCar("passengerCar", false, 0)

    passengerCar.performPassengerBoarding(3)
    passengerCar.startMoving()
    passengerCar.speedUp()
    passengerCar.reduceSpeed()
    passengerCar.stop()
    passengerCar.disembarkFromTheCar(3)
    passengerCar.performPassengerBoarding(2)
    passengerCar.startMoving()
    passengerCar.stop()
    passengerCar.disembarkFromTheCar(2)
    println()
    truck.performPassengerBoarding(1)
    truck.startMoving()
    truck.stop()
    truck.loadCargo(2.0)
    truck.startMoving()
    truck.stop()
    truck.unloadCargo(2.0)
    truck.disembarkFromTheCar(1)
}

abstract class Car : CarMoving, TransportationOfPassengers

interface CarMoving {

    val carName: String
    fun startMoving() = println("Автомобиль $carName начал движение.")

    fun reduceSpeed() = println("Автомобиль $carName снизил скорость.")

    fun speedUp() = println("Автомобиль $carName увеличил скорость.")

    fun stop() = println("Автомобиль $carName остановился.")
}

interface TransportationOfPassengers {

    val isTruck: Boolean
    var totalNumberOfPassengers: Int

    fun performPassengerBoarding(numberOfPassengersBoarding: Int) {

        if (isTruck) {
            if (totalNumberOfPassengers in 0..<1
                && (numberOfPassengersBoarding + totalNumberOfPassengers) <= 1
                && numberOfPassengersBoarding in 0..1
            ) {
                totalNumberOfPassengers += numberOfPassengersBoarding
                println("В грузовой автомобиль сел $numberOfPassengersBoarding пассажир.")
            } else {
                println("Нет свободных мест.")
            }
        } else {
            if (totalNumberOfPassengers in 0..<3
                && (numberOfPassengersBoarding + totalNumberOfPassengers) <= 3
                && numberOfPassengersBoarding in 0..3
            ) {
                totalNumberOfPassengers += numberOfPassengersBoarding
                println("В легковой автомобиль село $numberOfPassengersBoarding пассажира.")
            } else {
                println("Нет свободных мест.")
            }
        }
    }

    fun disembarkFromTheCar(numberOfPassengers: Int) {

        if (isTruck) {
            if (totalNumberOfPassengers == 1 && numberOfPassengers == 1) {
                totalNumberOfPassengers -= numberOfPassengers
                println("Высадилось $numberOfPassengers пассажиров.")
            } else {
                println("Неправильное колличество пассажиров.")
            }
        } else {
            if (totalNumberOfPassengers in 1..3
                && (totalNumberOfPassengers - numberOfPassengers) >= 0
                && numberOfPassengers in 0..3
            ) {
                totalNumberOfPassengers -= numberOfPassengers
                println("Высадилось $numberOfPassengers пассажиров.")
            } else {
                println("Неправильное колличество пассажиров.")
            }
        }
    }
}

interface CargoTransportation {

    var totalCargoQuantity: Double
    fun loadCargo(cargoQuantity: Double) {
        if (totalCargoQuantity in 0.0..2.0
            && (totalCargoQuantity + cargoQuantity) <= 2.0
            && cargoQuantity in 0.0..2.0
        ) {
            totalCargoQuantity += cargoQuantity
            println("Загружено $cargoQuantity т груза.")
        } else {
            println("Неправильное кол-во груза.")
        }
    }

    fun unloadCargo(cargoQuantity: Double) {
        if (totalCargoQuantity in 0.1..2.0
            && (totalCargoQuantity - cargoQuantity) >= 0.0
            && cargoQuantity in 0.0..2.0
        ) {
            totalCargoQuantity -= cargoQuantity
            println("Разгружено $cargoQuantity т груза.")
        } else {
            println("Неправильное кол-во груза.")
        }
    }
}

class Truck(
    override val carName: String,
    override val isTruck: Boolean,
    override var totalNumberOfPassengers: Int,
    override var totalCargoQuantity: Double,
) : Car(), CargoTransportation

class PassengerCar(
    override val carName: String,
    override val isTruck: Boolean,
    override var totalNumberOfPassengers: Int,
) : Car()
package lesson_15

fun main() {

    val temperature = Temperature(20)
    val precipitationAmount = PrecipitationAmount(1.5)

    val weatherServer = WeatherServer()
    weatherServer.sendStats(temperature)

    val weatherServer2 = WeatherServer()
    weatherServer2.sendStats(precipitationAmount)
}

abstract class WeatherStationStats(val stats: Any)

class Temperature(temp: Int) : WeatherStationStats(temp)

class PrecipitationAmount(stats: Double) : WeatherStationStats(stats)

class WeatherServer {
    fun sendStats(send: WeatherStationStats): Any {
        return if (send is Temperature) println("Температура ${send.stats} °С.")
        else println("Кол-во осадков составит ${send.stats} мм.")
    }
}
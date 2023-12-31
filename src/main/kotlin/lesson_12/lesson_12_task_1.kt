package lesson_12

fun main() {

    val weatherToday = DailyWeather()
    weatherToday.dailyTemperature = 29
    weatherToday.nightTemperature = 20
    weatherToday.hasPrecipitationDuringTheDay = true
    weatherToday.printDailyWeather()

    val newWeatherToday = DailyWeather()
    newWeatherToday.dailyTemperature = 27
    newWeatherToday.nightTemperature = 18
    newWeatherToday.hasPrecipitationDuringTheDay = false
    newWeatherToday.printDailyWeather()
}

class DailyWeather {

    var dailyTemperature = 25
    var nightTemperature = 18
    var hasPrecipitationDuringTheDay = false

    fun printDailyWeather() {
        println(
            "Информация о погоде:\n- дневная температура $dailyTemperature °C" +
                    "\n- ночная температура $nightTemperature °C" +
                    "\n- наличие осадков в течение суток: $hasPrecipitationDuringTheDay"
        )
    }
}
package lesson_12

fun main() {

    val weatherToday = DailyWeather4(300, 292, true)
}

class DailyWeather4(_dailyTemperature: Int, _nightTemperature: Int, _hasPrecipitationDuringTheDay: Boolean) {

    var dailyTemperature = _dailyTemperature - VALUE_DIFFERENCE
    var nightTemperature = _nightTemperature - VALUE_DIFFERENCE
    var hasPrecipitationDuringTheDay = _hasPrecipitationDuringTheDay

    init {
        println(
            String.format(
                "Информация о погоде:\n- дневная температура %.2f °C" +
                        "\n- ночная температура %.2f °C" +
                        "\n- наличие осадков в течение суток: $hasPrecipitationDuringTheDay",
                dailyTemperature, nightTemperature
            )
        )
    }

}

const val VALUE_DIFFERENCE = 273.15
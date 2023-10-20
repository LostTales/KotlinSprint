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
            "Информация о погоде:\n- дневная температура ${Math.round(dailyTemperature)} °C" +
                    "\n- ночная температура ${Math.round(nightTemperature)} °C" +
                    "\n- наличие осадков в течение суток: $hasPrecipitationDuringTheDay"
        )
    }

}

const val VALUE_DIFFERENCE = 273.15
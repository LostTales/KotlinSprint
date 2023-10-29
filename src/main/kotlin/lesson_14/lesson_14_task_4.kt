package lesson_14

fun main() {

    val planetMars = Planet(
        "Mars",
        true,
        true,
    )

    val satellitePhobos = SolarSystemObject("Phobos", false, true)
    val satelliteDeimos = SolarSystemObject("Deimos", false, true)

    planetMars.addSatellite(satellitePhobos)
    planetMars.addSatellite(satelliteDeimos)

    planetMars.showNames()

}

open class SolarSystemObject(
    val name: String,
    val hasPresenceAtmosphere: Boolean,
    val isSuitableForLanding: Boolean,
)

class Planet(
    name: String,
    hasPresenceAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
    val satellite: MutableList<SolarSystemObject> = mutableListOf<SolarSystemObject>(),
) : SolarSystemObject(name, hasPresenceAtmosphere, isSuitableForLanding) {

    fun addSatellite(satelliteAdd: SolarSystemObject) {
        satellite.add(satelliteAdd)
        println("Объект ${satelliteAdd.name} добавлен в спутники планеты $name.")
    }

    fun showNames() {
        println("Планета $name, спутники: ${satellite.joinToString { it.name }}.")
    }
}


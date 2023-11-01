package lesson_14

fun main() {

    val planetMars = Planet(
        "Mars",
        true,
        true,
    )

    val satellitePhobos = Satellite("Phobos", false, true)
    val satelliteDeimos = Satellite("Deimos", false, true)

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
    val satellite: MutableList<Satellite> = mutableListOf(),
) : SolarSystemObject(name, hasPresenceAtmosphere, isSuitableForLanding) {

    fun addSatellite(satelliteAdd: Satellite) {
        satellite.add(satelliteAdd)
        println("Объект ${satelliteAdd.name} добавлен в спутники планеты $name.")
    }

    fun showNames() {
        println("Планета $name, спутники: ${satellite.joinToString { it.name }}.")
    }
}

class Satellite(
    name: String,
    hasPresenceAtmosphere: Boolean,
    isSuitableForLanding: Boolean
) : SolarSystemObject(name, hasPresenceAtmosphere, isSuitableForLanding)


package lesson_19

fun main() {

    showAquariumFish()
}

enum class AquariumFish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun showAquariumFish() {
    println("Рыбы для аквариума:")
    for (i in AquariumFish.entries) println(i)
}
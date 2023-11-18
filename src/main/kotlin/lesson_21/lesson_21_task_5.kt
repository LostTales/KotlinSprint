package lesson_21

fun main() {

    val hero = mutableMapOf<String, Int>(
        Pair("heals", 75), Pair("strength", 35),
        Pair("agility", 100), Pair("intellect", 50)
    )
    println(hero.maxCategory())
}

fun Map<String, Int>.maxCategory(): String {

    return (this.maxBy { it.value }).key
}
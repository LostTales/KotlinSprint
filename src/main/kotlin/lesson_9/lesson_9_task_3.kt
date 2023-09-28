package lesson_9

fun main() {

    val numberOfIngredientsForOmelet = mutableListOf(2, 50, 15)

    println("Сколько порций омлета?")
    val numberOfServings = readln().toInt()

    val newNumberOfIngredientsForOmelet = numberOfIngredientsForOmelet.map { it * numberOfServings }

    println(
        "На $numberOfServings порций вам понадобиться: Яиц - ${newNumberOfIngredientsForOmelet[0]}, " +
                "молока - ${newNumberOfIngredientsForOmelet[1]}," +
                " сливочного масла - ${newNumberOfIngredientsForOmelet[2]}"
    )

}
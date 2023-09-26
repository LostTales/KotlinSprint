package lesson_8

fun main() {

    val viewsWeek = Array(7) { 0 }

    for (i in 0 until viewsWeek.size) {
        when (i) {
            0 -> {
                println("Кол-во просмотров в понедельник:")
                viewsWeek[i] = readln().toInt()
            }

            1 -> {
                println("Кол-во просмотров во вторник:")
                viewsWeek[i] = readln().toInt()
            }

            2 -> {
                println("Кол-во просмотров в среду:")
                viewsWeek[i] = readln().toInt()
            }

            3 -> {
                println("Кол-во просмотров в четверг:")
                viewsWeek[i] = readln().toInt()
            }

            4 -> {
                println("Кол-во просмотров в пятницу:")
                viewsWeek[i] = readln().toInt()
            }

            5 -> {
                println("Кол-во просмотров в субботу:")
                viewsWeek[i] = readln().toInt()
            }

            6 -> {
                println("Кол-во просмотров в воскресенье:")
                viewsWeek[i] = readln().toInt()
            }

        }

    }

    var totalViews = 0

    for (i in viewsWeek) {
        totalViews += i
    }
    println("Всего просмотров: $totalViews")

}
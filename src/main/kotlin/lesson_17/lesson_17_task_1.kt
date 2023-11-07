package lesson_17

fun main() {

    val question = Quiz("вопрос", "ответ")
}

class Quiz(
    _question: String,
    _answer: String,
) {
    var question = _question
        get() = field
        set(value) {
            field = value
        }

    var answer = _answer
        set(value) {
            field = value
        }
}
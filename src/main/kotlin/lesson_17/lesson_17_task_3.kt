package lesson_17

fun main() {

    val myFiles = Package("favorites", 70, false)
    println(myFiles.name)
    println()
    myFiles.isSecretFiles = true
    println(myFiles.name)
    println()
    myFiles.isSecretFiles = false
    println(myFiles.name)
}

class Package(

    _name: String,
    var files: Int,
    var isSecretFiles: Boolean,
) {

    val name = _name
        get() {
            return if (isSecretFiles) {
                "$HIDDEN_DOCUMENTS $NUMBER_OF_FILES $ZERO"
            } else {
                "$field $NUMBER_OF_FILES $files"
            }
        }
}

private const val HIDDEN_DOCUMENTS = "скрытая папка"
private const val NUMBER_OF_FILES = "количество файлов"
private const val ZERO = 0

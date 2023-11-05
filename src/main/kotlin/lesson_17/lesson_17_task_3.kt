package lesson_17

fun main() {

    val myFiles = Package()
    println(myFiles.name)
    println()
    myFiles.isSecretFiles = true
    println(myFiles.name)
}

class Package {

    var name: String = "favorites"
        get() {
            return if (isSecretFiles) {
                files = 0
                "${HIDDEN_DOCUMENTS} $NUMBER_OF_FILES $files"
            } else {
                "$field $NUMBER_OF_FILES $files"
            }
        }

    var files: Int = 70

    var isSecretFiles: Boolean = false
}

const val HIDDEN_DOCUMENTS = "скрытая папка"
const val NUMBER_OF_FILES = "количество файлов"

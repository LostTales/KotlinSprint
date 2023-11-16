package lesson_22

fun main() {

    val mainScreenViewModel = MainScreenViewModel()
    val mainScreenState = MainScreenViewModel().mainScreenState
    println(mainScreenViewModel.loadData(mainScreenState, InputData.NO_DATA))
    println(mainScreenViewModel.loadData(mainScreenState, InputData.DATA_LOADING))
    println(mainScreenViewModel.loadData(mainScreenState, InputData.AVAILABILITY_OF_UPLOADED_DATA))
    println(mainScreenViewModel.loadData(mainScreenState, InputData.ERROR))
}

class MainScreenViewModel {

    var mainScreenState: MainScreenState = MainScreenState()

    data class MainScreenState(
        var data: String = "",
        var isLoading: Boolean = false,
    )

    fun loadData(_mainScreenState: MainScreenState, inputData: InputData): MainScreenState {
        when (inputData) {

            InputData.NO_DATA -> {
                _mainScreenState.data = InputData.NO_DATA.status.toString()
                _mainScreenState.isLoading = true
                mainScreenState = _mainScreenState.copy(_mainScreenState.data, _mainScreenState.isLoading)
            }

            InputData.DATA_LOADING -> {
                _mainScreenState.data = InputData.DATA_LOADING.status.toString()
                _mainScreenState.isLoading = true
                mainScreenState = _mainScreenState.copy(_mainScreenState.data, _mainScreenState.isLoading)
            }

            InputData.AVAILABILITY_OF_UPLOADED_DATA -> {
                _mainScreenState.data = InputData.AVAILABILITY_OF_UPLOADED_DATA.status.toString()
                _mainScreenState.isLoading = true
                mainScreenState = _mainScreenState.copy(_mainScreenState.data, _mainScreenState.isLoading)
            }

            else -> {
                _mainScreenState.data = InputData.ERROR.status.toString()
                mainScreenState = _mainScreenState.copy(_mainScreenState.data)
            }
        }
        return mainScreenState
    }
}

enum class InputData(val status: String? = null) {
    NO_DATA("отсутствие данных"),
    DATA_LOADING("загрузка данных"),
    AVAILABILITY_OF_UPLOADED_DATA("наличие загруженных данных"),
    ERROR()
}
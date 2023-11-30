package cd.ghost.genusd.screens

import android.annotation.SuppressLint
import android.util.Log
import cd.ghost.genusd.R
import cd.ghost.genusd.core.BaseViewModel
import cd.ghost.genusd.core.NoDataException
import cd.ghost.genusd.core.Resources
import cd.ghost.genusd.data.model.Currency
import cd.ghost.genusd.data.model.CurrencyModel
import cd.ghost.genusd.data.repository.CurrenciesRepository
import kotlinx.coroutines.flow.MutableStateFlow

class CurrenciesViewModel(
    private val repository: CurrenciesRepository,
    private val resources: Resources
) : BaseViewModel() {

    private val TAG = "CurrenciesViewModel"

    private val _state = MutableStateFlow<State>(UiState())
    val state = _state.asStateFlow()

    fun getCurrencies() {
        repository
            .getCurrencies()
            .safeLaunch(
                result = ::setResult,
                progress = ::setProgress,
                errors = ::setError
            )
    }

    private fun setResult(list: List<CurrencyModel>) {
        _state.value = _state.value.copy(
            list = list
        )
    }

    private fun setProgress(progress: Boolean) {
        _state.value = _state.value.copy(
            isInProgress = progress
        )
    }

    @SuppressLint("ResourceType")
    private fun setError(throwable: Throwable) {
        Log.e(TAG, "setError: ", throwable)
        when (throwable) {
            is NoDataException -> {
                _state.value = _state.value.copy(
                    errorMessage = resources.getString(R.string.no_data)
                )
            }

            else -> {
                _state.value = _state.value.copy(
                    errorMessage = resources.getString(R.string.sth_went_wrong)
                )
            }
        }
    }

    class UiState(
        override val list: List<CurrencyModel> = listOf(),
        override val isInProgress: Boolean = false,
        errorMessage: String? = null
    ) : State {

        private var _errorMessage: String? = errorMessage

        override fun getErrorMessage(): String? {
            return _errorMessage.also { _errorMessage = null }
        }

        override fun copy(
            list: List<CurrencyModel>,
            isInProgress: Boolean,
            errorMessage: String?
        ): State = UiState(
            list = list,
            isInProgress = isInProgress,
            errorMessage = errorMessage
        )

    }

    interface State {
        val list: List<CurrencyModel>
        val isInProgress: Boolean
        fun getErrorMessage(): String?

        fun copy(
            list: List<CurrencyModel> = this.list,
            isInProgress: Boolean = this.isInProgress,
            errorMessage: String? = this.getErrorMessage()
        ): State
    }

}



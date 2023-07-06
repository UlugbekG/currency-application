package cd.ghost.genusd.screens

import android.content.Context
import cd.ghost.genusd.R
import cd.ghost.genusd.core.BackendException
import cd.ghost.genusd.core.BaseViewModel
import cd.ghost.genusd.core.NoConnection
import cd.ghost.genusd.data.model.Currency
import cd.ghost.genusd.data.repository.Repository
import kotlinx.coroutines.flow.MutableStateFlow

class CurrenciesViewModel(
    private val repository: Repository,
    private val context: Context
) : BaseViewModel() {

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

    private fun setResult(list: List<Currency>) {
        _state.value = _state.value.copy(
            list = list
        )
    }

    private fun setProgress(progress: Boolean) {
        _state.value = _state.value.copy(
            isInProgress = progress
        )
    }

    private fun setError(throwable: Throwable) {
        when (throwable) {
            is NoConnection -> {
                _state.value = _state.value.copy(
                    errorMessage = context.getString(R.string.no_cennection)
                )
            }

            is BackendException -> {
                _state.value = _state.value.copy(
                    errorMessage = context.getString(R.string.sth_went_wrong)
                )
            }
        }
    }

    class UiState(
        override val list: List<Currency> = listOf(),
        override val isInProgress: Boolean = false,
        errorMessage: String? = null
    ) : State {

        private var _errorMessage: String? = errorMessage

        override fun getErrorMessage(): String? {
            return _errorMessage.also { _errorMessage = null }
        }

        override fun copy(
            list: List<Currency>,
            isInProgress: Boolean,
            errorMessage: String?
        ): State = UiState(
            list = list,
            isInProgress = isInProgress,
            errorMessage = errorMessage
        )

    }

    interface State {
        val list: List<Currency>
        val isInProgress: Boolean
        fun getErrorMessage(): String?

        fun copy(
            list: List<Currency> = this.list,
            isInProgress: Boolean = this.isInProgress,
            errorMessage: String? = this.getErrorMessage()
        ): State
    }

}



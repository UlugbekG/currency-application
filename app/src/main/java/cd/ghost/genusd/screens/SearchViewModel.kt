package cd.ghost.genusd.screens

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cd.ghost.genusd.data.model.Currency
import cd.ghost.genusd.data.model.CurrencyModel
import cd.ghost.genusd.data.repository.CurrenciesRepository
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class SearchViewModel(
    private val repository: CurrenciesRepository
) : ViewModel() {

    private val _state = MutableLiveData(State(listOf()))
    val state: LiveData<State> = _state

    private var searchJob: Job? = null

    fun search(str: String?) {
        _state.value = _state.value?.copy(isLoading = true)

        searchJob?.cancel()
        searchJob = viewModelScope.launch {

            delay(500)

            repository.getCurrenciesByQuery(str)
                .catch {
                    _state.value = _state.value?.copy(
                        isLoading = false,
                        error = "Something went wrong!"
                    )
                }
                .collectLatest {
                    _state.value = _state.value?.copy(
                        isLoading = false,
                        list = it
                    )
                }

        }

    }

    data class State(
        val list: List<CurrencyModel>,
        val isLoading: Boolean = false,
        val error: String? = null
    )
}
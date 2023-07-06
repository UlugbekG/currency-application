package cd.ghost.genusd.core

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

abstract class BaseViewModel : ViewModel() {

    fun <T> MutableStateFlow<T>.asStateFlow(): StateFlow<T> = this

    fun <T> Flow<T>.safeLaunch(
        result: (T) -> Unit,
        progress: (Boolean) -> Unit,
        errors: (throwable: Throwable) -> Unit
    ) = try {
        viewModelScope.launch {
            progress.invoke(true)
            this@safeLaunch
                .catch {
                    errors.invoke(it)
                    progress.invoke(false)
                }
                .collectLatest {
                    result.invoke(it)
                    progress.invoke(false)
                }
        }
    } catch (e: AppException) {
        errors.invoke(e)
    }


}
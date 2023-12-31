package cd.ghost.genusd.core

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

typealias ViewModelCreator<VM> = () -> VM


class ViewModelFactory<VM : ViewModel>(
    private val creator: ViewModelCreator<VM>
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return creator.invoke() as T
    }
}

inline fun <reified VM : ViewModel> Fragment.screenViewModel(
    noinline viewModelCreator: ViewModelCreator<VM>
) = viewModels<VM> {
    ViewModelFactory(viewModelCreator)
}

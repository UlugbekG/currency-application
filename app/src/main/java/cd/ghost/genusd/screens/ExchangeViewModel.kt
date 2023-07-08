package cd.ghost.genusd.screens

import cd.ghost.genusd.core.BaseViewModel
import cd.ghost.genusd.data.model.Currency
import kotlinx.coroutines.flow.MutableStateFlow
import java.math.BigDecimal

class ExchangeViewModel : BaseViewModel() {

    private var currency: Currency? = null

    private val _sCcy = MutableStateFlow(BLANK)
    val sCcy = _sCcy.asStateFlow()

    private val _uzCcy = MutableStateFlow(BLANK)
    val uzCcy = _uzCcy.asStateFlow()

    fun setCurrency(currency: Currency?) {
        this.currency = currency
    }

    fun calculateUzCcy(str: String?) {
        try {
            if (str.isNullOrBlank() || currency == null) {
                _uzCcy.value = BLANK
                return
            }
            val result = BigDecimal(currency?.rate).multiply(BigDecimal(str))
            _uzCcy.value = result.toString()
        } catch (e: Exception) {
            // show error
        }
    }

    fun calculateSCcy(str: String?) {
        try {
            if (str.isNullOrBlank() || currency == null) {
                _sCcy.value = BLANK
                return
            }
            val result = BigDecimal(str).div(BigDecimal(currency?.rate))
            _sCcy.value = result.toString()
        } catch (e: Exception) {
            // show error
        }
    }

    private companion object {
        const val BLANK = ""
    }
}
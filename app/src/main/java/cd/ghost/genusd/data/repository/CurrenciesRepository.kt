package cd.ghost.genusd.data.repository

import cd.ghost.genusd.data.model.Currency
import cd.ghost.genusd.data.model.CurrencyModel
import kotlinx.coroutines.flow.Flow

interface CurrenciesRepository {

    fun getCurrencies(): Flow<List<CurrencyModel>>

    fun getCurrenciesByQuery(str: String?): Flow<List<CurrencyModel>>

}
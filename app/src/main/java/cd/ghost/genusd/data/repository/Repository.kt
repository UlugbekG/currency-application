package cd.ghost.genusd.data.repository

import android.util.Log
import cd.ghost.genusd.core.NoDataException
import cd.ghost.genusd.data.database.AppDatabase
import cd.ghost.genusd.data.model.Currency
import cd.ghost.genusd.data.networking.CurrencyApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.Retrofit
import java.io.IOException

class Repository(
    retrofit: Retrofit,
    appDatabase: AppDatabase
) {

    private val apiService = retrofit.create(CurrencyApiService::class.java)
    private val currencyDao = appDatabase.currencyDao()

    fun getCurrencies(): Flow<List<Currency>> =
        flow {
            val response = apiService.getList().map {
                it.mapToEntity()
            }
            currencyDao.insert(response)
            val resultList = getFromDB()
            emit(resultList)
        }
            .catch {
                if (getFromDB().isEmpty()) {
                    throw NoDataException()
                } else {
                    emit(getFromDB())
                }
            }
            .flowOn(Dispatchers.IO)

    private suspend fun getFromDB(): List<Currency> {
        return currencyDao.getCurrencies().map {
            it.mapToModel()
        }
    }
}
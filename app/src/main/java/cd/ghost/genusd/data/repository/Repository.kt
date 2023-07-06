package cd.ghost.genusd.data.repository

import cd.ghost.genusd.core.BackendException
import cd.ghost.genusd.core.NoConnection
import cd.ghost.genusd.data.model.Currency
import cd.ghost.genusd.data.networking.CurrencyApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.HttpException
import retrofit2.Retrofit
import java.io.IOException

class Repository(
    retrofit: Retrofit
) {

    private val apiService = retrofit
        .create(CurrencyApiService::class.java)

    fun getCurrencies(): Flow<List<Currency>> =
        flow {
            emit(apiService.getList())
        }
            .catch {
                throw when (it) {
                    is IOException -> NoConnection()
                    is HttpException -> BackendException(it)
                    else -> it
                }
            }
            .flowOn(Dispatchers.IO)
}
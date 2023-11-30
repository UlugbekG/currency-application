package cd.ghost.genusd.data.repository

import android.graphics.Bitmap
import cd.ghost.genusd.core.NoDataException
import cd.ghost.genusd.core.removeLastLetter
import cd.ghost.genusd.core.toByteArray
import cd.ghost.genusd.data.database.CurrencyDao
import cd.ghost.genusd.data.model.CurrencyModel
import cd.ghost.genusd.data.networking.CurrencyApiService
import com.bumptech.glide.RequestBuilder
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class RepositoryImp(
    private val apiService: CurrencyApiService,
    private val currencyDao: CurrencyDao,
    private val bitmapLoader: RequestBuilder<Bitmap>,
) : CurrenciesRepository {

    override fun getCurrencies(): Flow<List<CurrencyModel>> = flow {
        val currencies = apiService
            .getList()
            .map {
                val code = it.ccy.lowercase().removeLastLetter()
                val bitmap = try {
                    bitmapLoader.load("https://flagcdn.com/w160/${code}.png")
                        .submit()
                        .get()
                        .toByteArray()
                } catch (e: Exception) {
                    null
                }
                it.mapToEntity().copy(iconByte = bitmap)
            }
        currencyDao.insert(currencies)

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

    override fun getCurrenciesByQuery(str: String?): Flow<List<CurrencyModel>> = flow {
        if (getFromDB().isEmpty()) {
            val map = getCurrencies().first()
            val filter = map.filter { it.ccy.lowercase().contains(str.toString()) }
            emit(filter)
            return@flow
        }
        val list = getDataQuery(str)
        emit(list)
    }
        .catch {
            if (getFromDB().isEmpty()) {
                throw NoDataException()
            } else {
                emit(getFromDB())
            }
        }
        .flowOn(Dispatchers.IO)

    private suspend fun getDataQuery(str: String?): List<CurrencyModel> {
        if (str.isNullOrBlank()) return getFromDB()
        return currencyDao.getByQuery("%${str.lowercase()}%").map {
            it.toCurrencyModel()
        }
    }

    private suspend fun getFromDB(): List<CurrencyModel> {
        return currencyDao.getCurrencies().map {
            it.toCurrencyModel()
        }
    }
}


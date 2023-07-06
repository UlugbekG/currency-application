package cd.ghost.genusd.data.networking

import cd.ghost.genusd.data.model.Currency
import retrofit2.http.GET

interface CurrencyApiService {

    @GET("uzc/arkhiv-kursov-valyut/json/")
    suspend fun getList(): List<Currency>
}
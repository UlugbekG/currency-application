package cd.ghost.genusd

import android.content.Context
import androidx.room.Room
import cd.ghost.genusd.core.Resources
import cd.ghost.genusd.data.database.AppDatabase
import cd.ghost.genusd.data.database.MIGRATION_1_2
import cd.ghost.genusd.data.networking.CurrencyApiService
import cd.ghost.genusd.data.repository.CurrenciesRepository
import cd.ghost.genusd.data.repository.RepositoryImp
import com.bumptech.glide.Glide
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object DependencyProvider {

    private lateinit var applicationContext: Context

    private val client by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private val appDatabase by lazy {
        Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            DB_NAME
        )
            .addMigrations(MIGRATION_1_2)
            .build()
    }

    private val bitmapLoader by lazy {
        Glide.with(applicationContext)
            .asBitmap()
    }

    val repository: CurrenciesRepository by lazy {
        RepositoryImp(
            apiService = client.create(CurrencyApiService::class.java),
            currencyDao = appDatabase.currencyDao(),
            bitmapLoader = bitmapLoader
        )
    }

    val resources by lazy { Resources(applicationContext) }

    fun init(context: Context) {
        applicationContext = context
    }

    private const val BASE_URL = "http://cbu.uz/"
    private const val DB_NAME = "cd-ghost-db-currency"
}
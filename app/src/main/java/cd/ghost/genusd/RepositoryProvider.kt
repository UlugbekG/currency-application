package cd.ghost.genusd

import android.content.Context
import androidx.room.Room
import cd.ghost.genusd.core.Resources
import cd.ghost.genusd.data.database.AppDatabase
import cd.ghost.genusd.data.repository.Repository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RepositoryProvider {

    private lateinit var applicationContext: Context

    private val client by lazy {
        Retrofit
            .Builder()
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
            .fallbackToDestructiveMigration()
            .build()
    }

    val repository by lazy { Repository(client, appDatabase) }

    val resources by lazy { Resources(applicationContext) }

    fun init(context: Context) {
        applicationContext = context
    }

    private const val BASE_URL = "http://cbu.uz/"
    private const val DB_NAME = "cd-ghost-db-currency"
}
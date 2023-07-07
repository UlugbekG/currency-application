package cd.ghost.genusd.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CurrencyDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(list: List<CurrencyEntity>)

    @Query("SELECT * FROM `currency-table`")
    suspend fun getCurrencies(): List<CurrencyEntity>

    @Query("DELETE FROM `currency-table`")
    suspend fun deleteAll()

}
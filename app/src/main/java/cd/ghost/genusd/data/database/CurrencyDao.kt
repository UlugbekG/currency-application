package cd.ghost.genusd.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction

@Dao
interface CurrencyDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(list: List<CurrencyEntity>)

    @Query("SELECT * FROM `currency-table`")
    suspend fun getCurrencies(): List<CurrencyEntity>

    @Query(
        "SELECT * FROM `currency-table` WHERE LOWER(ccy) LIKE LOWER(:str) " +
                "OR LOWER(ccyNmUZ) LIKE LOWER(:str)"
    )
    suspend fun getByQuery(str: String): List<CurrencyEntity>

    @Transaction
    suspend fun withTransaction(list: List<CurrencyEntity>) {
        deleteAll()
        insert(list)
    }

    @Query("DELETE FROM `currency-table`")
    suspend fun deleteAll()

}
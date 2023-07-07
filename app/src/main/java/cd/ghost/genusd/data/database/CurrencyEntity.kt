package cd.ghost.genusd.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import cd.ghost.genusd.data.model.Currency


@Entity("currency-table")
data class CurrencyEntity(
    val ccy: String,
    val ccyNmEN: String,
    val ccyNmRU: String,
    val ccyNmUZ: String,
    val ccyNmUZC: String,
    val code: String,
    val date: String,
    val diff: String,
    val nominal: String,
    val rate: String,
    @PrimaryKey val id: Int
) {
    fun mapToModel() = Currency(
        ccy = this.ccy,
        ccyNmEN = this.ccyNmEN,
        ccyNmRU = this.ccyNmRU,
        ccyNmUZ = this.ccyNmUZ,
        ccyNmUZC = this.ccyNmUZC,
        code = this.code,
        date = this.date,
        diff = this.diff,
        nominal = this.nominal,
        rate = this.rate,
        id = this.id
    )
}
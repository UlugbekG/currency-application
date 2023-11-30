package cd.ghost.genusd.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import cd.ghost.genusd.core.toBitmap
import cd.ghost.genusd.data.model.CurrencyModel


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
    @PrimaryKey val id: Int,
    val iconByte: ByteArray?,
) {
    fun toCurrencyModel() = CurrencyModel(
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
        id = this.id,
        flagIcon = this.iconByte?.toBitmap()
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CurrencyEntity

        if (ccy != other.ccy) return false
        if (ccyNmEN != other.ccyNmEN) return false
        if (ccyNmRU != other.ccyNmRU) return false
        if (ccyNmUZ != other.ccyNmUZ) return false
        if (ccyNmUZC != other.ccyNmUZC) return false
        if (code != other.code) return false
        if (date != other.date) return false
        if (diff != other.diff) return false
        if (nominal != other.nominal) return false
        if (rate != other.rate) return false
        if (id != other.id) return false
        if (!iconByte.contentEquals(other.iconByte)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = ccy.hashCode()
        result = 31 * result + ccyNmEN.hashCode()
        result = 31 * result + ccyNmRU.hashCode()
        result = 31 * result + ccyNmUZ.hashCode()
        result = 31 * result + ccyNmUZC.hashCode()
        result = 31 * result + code.hashCode()
        result = 31 * result + date.hashCode()
        result = 31 * result + diff.hashCode()
        result = 31 * result + nominal.hashCode()
        result = 31 * result + rate.hashCode()
        result = 31 * result + id
        result = 31 * result + iconByte.contentHashCode()
        return result
    }
}
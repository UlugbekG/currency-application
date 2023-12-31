package cd.ghost.genusd.data.model

import cd.ghost.genusd.data.database.CurrencyEntity
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Currency(
    @SerializedName("Ccy") val ccy: String,
    @SerializedName("CcyNm_EN") val ccyNmEN: String,
    @SerializedName("CcyNm_RU") val ccyNmRU: String,
    @SerializedName("CcyNm_UZ") val ccyNmUZ: String,
    @SerializedName("CcyNm_UZC") val ccyNmUZC: String,
    @SerializedName("Code") val code: String,
    @SerializedName("Date") val date: String,
    @SerializedName("Diff") val diff: String,
    @SerializedName("Nominal") val nominal: String,
    @SerializedName("Rate") val rate: String,
    @SerializedName("id") val id: Int
) {

    fun mapToEntity() = CurrencyEntity(
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
        iconByte = null
    )
}
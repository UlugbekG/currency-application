package cd.ghost.genusd.data.model

import android.graphics.Bitmap
import java.io.Serializable

data class CurrencyModel(
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
    val id: Int,
    val flagIcon: Bitmap?
) : Serializable
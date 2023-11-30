package cd.ghost.genusd.screens.view

import android.content.Context
import android.graphics.Color
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import cd.ghost.genusd.R
import cd.ghost.genusd.data.model.Currency
import cd.ghost.genusd.data.model.CurrencyModel
import cd.ghost.genusd.databinding.ViewExchangeBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners

typealias TextListener = (String?) -> Unit

class ExchangeView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyleAttr, defStyleRes) {

    private var binding: ViewExchangeBinding
    private var currency: CurrencyModel? = null
    private var sCcyListener: TextListener? = null
    private var uzCcyListener: TextListener? = null
    private var onCancel: (() -> Unit)? = null
    private lateinit var edUzCcyWatcher: TextWatcher
    private lateinit var edSCcyWatcher: TextWatcher
    private var uzCcy: String = ""
    private var sCcy: String = ""


    init {
        val inflater = LayoutInflater.from(context)
        binding = ViewExchangeBinding.inflate(inflater, this, false)

        addView(binding.root)

        binding.btnClose.setOnClickListener {
            onCancel?.invoke()
        }
    }

    fun setSCcyTextListener(listener: TextListener) {
        sCcyListener = listener
    }

    fun setUzCcyTextListener(listener: TextListener) {
        uzCcyListener = listener
    }

    fun setTextCcyUz(str: String) {
        uzCcy = str
    }

    fun setTextSCcy(str: String) {
        sCcy = str
    }

    fun onCloseListener(block: () -> Unit) {
        onCancel = block
    }

    fun setData(currency: CurrencyModel?) {
        this.currency = currency

        setupListeners()

        binding.apply {
            tvShortName.text = currency?.ccy
            tvRate.text = currency?.rate
            tvDiff.text = currency?.diff
            Glide.with(root.context)
                .load(currency?.flagIcon)
                .placeholder(R.drawable.fla_placeholder)
                .transform(CenterCrop(), RoundedCorners(12))
                .into(ivFlag)
            tvLastUpdate.text = currency?.date
            tvFullName.text = currency?.ccyNmUZ
            tvCcy.text = currency?.ccy

            tvDiff.text =
                if ((currency?.diff?.toDouble() ?: 0.0) >= 0) "+${currency?.diff}"
                else currency?.diff

            tvDiff.setTextColor(
                if ((currency?.diff?.toDouble() ?: 0.0) >= 0) Color.parseColor("#50A339")
                else Color.parseColor("#FF2B2B")
            )
        }
    }

    private fun setupListeners() {
        binding.apply {
            edUzCcyWatcher = object : TextWatcher {
                override fun afterTextChanged(s: Editable?) = Unit
                override fun beforeTextChanged(
                    text: CharSequence?, start: Int, count: Int, after: Int
                ) = Unit

                override fun onTextChanged(
                    text: CharSequence?, start: Int, before: Int, count: Int
                ) {
                    edSCcy.removeTextChangedListener(edSCcyWatcher)
                    uzCcyListener?.invoke(text?.toString())
                    edSCcy.setText(sCcy)
                    edSCcy.addTextChangedListener(edSCcyWatcher)
                }
            }

            edSCcyWatcher = object : TextWatcher {
                override fun afterTextChanged(s: Editable?) = Unit
                override fun beforeTextChanged(
                    text: CharSequence?, start: Int, count: Int, after: Int
                ) = Unit

                override fun onTextChanged(
                    text: CharSequence?, start: Int, before: Int, count: Int
                ) {
                    edUzCcy.removeTextChangedListener(edUzCcyWatcher)
                    sCcyListener?.invoke(text?.toString())
                    edUzCcy.setText(uzCcy)
                    edUzCcy.addTextChangedListener(edUzCcyWatcher)
                }
            }

            edUzCcy.addTextChangedListener(edUzCcyWatcher)
            edSCcy.addTextChangedListener(edSCcyWatcher)
        }
    }
}
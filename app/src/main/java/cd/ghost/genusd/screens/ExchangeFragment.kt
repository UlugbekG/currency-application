package cd.ghost.genusd.screens

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import cd.ghost.genusd.R
import cd.ghost.genusd.core.serializable
import cd.ghost.genusd.core.viewBinding
import cd.ghost.genusd.data.model.Currency
import cd.ghost.genusd.databinding.FragmentExchangeBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import java.io.Serializable

class ExchangeFragment : BottomSheetDialogFragment(R.layout.fragment_exchange) {

    private val binding by viewBinding<FragmentExchangeBinding>()
    private var currency: Currency? = null

    class ExchangeData(
        val data: Currency
    ) : Serializable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        currency = arguments
            ?.serializable<ExchangeData>(ARG_1)
            ?.data
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    companion object {
        const val ARG_1 = "EXCHANGE_ARG_1"
        fun newInstance(data: Currency) =
            ExchangeFragment().apply {
                arguments = bundleOf(ARG_1 to ExchangeData(data))
            }
    }

}
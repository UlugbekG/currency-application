package cd.ghost.genusd.screens

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import cd.ghost.genusd.R
import cd.ghost.genusd.core.screenViewModel
import cd.ghost.genusd.core.serializable
import cd.ghost.genusd.core.viewBinding
import cd.ghost.genusd.data.model.Currency
import cd.ghost.genusd.databinding.FragmentExchangeBinding
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import java.io.Serializable

class ExchangeFragment : DialogFragment(R.layout.fragment_exchange) {

    private val binding by viewBinding<FragmentExchangeBinding>()
    private val viewModel by screenViewModel { ExchangeViewModel() }
    private var currency: Currency? = null

    class ExchangeData(
        val data: Currency
    ) : Serializable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        currency = arguments?.serializable<ExchangeData>(ARG_1)?.data
        viewModel.setCurrency(currency)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
    }

    private fun setupListeners() {

        binding.apply {
            root.setOnClickListener {
                parentFragmentManager.popBackStack()
            }

            exchangeView.apply {
                setData(currency)

                onCloseListener {
                    parentFragmentManager.popBackStack()
                }

                setSCcyTextListener {
                    viewModel.calculateUzCcy(it)
                }

                setUzCcyTextListener {
                    viewModel.calculateSCcy(it)
                }

            }

            lifecycleScope.launch {
                lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
                    viewModel.sCcy.collectLatest {
                        exchangeView.setTextSCcy(it)
                    }
                }
            }

            lifecycleScope.launch {
                lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
                    viewModel.uzCcy.collectLatest {
                        exchangeView.setTextCcyUz(it)
                    }
                }
            }
        }
    }

    companion object {
        const val ARG_1 = "EXCHANGE_ARG_1"
        fun newInstance(data: Currency) = ExchangeFragment()
            .apply {
                arguments = bundleOf(ARG_1 to ExchangeData(data))
            }
    }

}
package cd.ghost.genusd.screens

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import cd.ghost.genusd.R
import cd.ghost.genusd.RepositoryProvider
import cd.ghost.genusd.core.RecyclerAdapter
import cd.ghost.genusd.core.screenViewModel
import cd.ghost.genusd.core.viewBinding
import cd.ghost.genusd.data.model.Currency
import cd.ghost.genusd.databinding.FragmentCurrenciesBinding
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class CurrenciesFragment : Fragment(R.layout.fragment_currencies) {

    private val binding by viewBinding<FragmentCurrenciesBinding>()
    private val viewModel by screenViewModel<CurrenciesViewModel> {
        CurrenciesViewModel(
            repository = RepositoryProvider.repository,
            resources = RepositoryProvider.resources
        )
    }
    private lateinit var adapter: RecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.getCurrencies()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observeState()
        setupListeners()
        setupRecyclerAdapter()
    }

    private fun setupListeners() {
        binding.swiperefresh.setOnRefreshListener {
            viewModel.getCurrencies()
        }
    }

    private fun setupRecyclerAdapter() {
        adapter = RecyclerAdapter(::onItemClick)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
    }

    private fun observeState() {
        lifecycleScope.launch {
            lifecycle.repeatOnLifecycle(Lifecycle.State.RESUMED) {
                viewModel.state.collectLatest {
                    adapter.submitList(it.list)
                    binding.swiperefresh.isRefreshing = it.isInProgress
                    showErrors(it.getErrorMessage())
                }
            }
        }
    }

    private fun onItemClick(item: Currency) {
        val fragment = ExchangeFragment.newInstance(item)
        parentFragmentManager
            .beginTransaction()
            .add(R.id.fragmentContainer, fragment, item.code)
            .addToBackStack(item.code)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            .commit()
    }

    private fun showErrors(message: String?) {
        if (message != null) Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    }
}
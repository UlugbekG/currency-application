package cd.ghost.genusd.screens

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import cd.ghost.genusd.DependencyProvider
import cd.ghost.genusd.R
import cd.ghost.genusd.core.screenViewModel
import cd.ghost.genusd.core.viewBinding
import cd.ghost.genusd.data.model.Currency
import cd.ghost.genusd.data.model.CurrencyModel
import cd.ghost.genusd.databinding.FragmentSearchBinding

class SearchFragment : Fragment(R.layout.fragment_search) {

    private lateinit var adapter: RecyclerAdapter
    private val binding by viewBinding<FragmentSearchBinding>()
    private val viewModel by screenViewModel {
        SearchViewModel(DependencyProvider.repository)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerAdapter()
        observeState()
        setupListeners()
    }

    private fun observeState() {
        viewModel.state.observe(viewLifecycleOwner) { state ->
            binding.progressBar.isVisible = state.isLoading
            adapter.submitList(state.list)
        }
    }

    private fun setupRecyclerAdapter() {
        adapter = RecyclerAdapter(::onItemClick)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
    }

    private fun setupListeners() {
        binding.apply {
            edSearch.addTextChangedListener {
                viewModel.search(it?.toString())
                btnClear.isVisible = !it.isNullOrBlank()
            }
            btnClear.setOnClickListener {
                edSearch.setText("")
            }
        }
    }

    private fun onItemClick(item: CurrencyModel) {
        val fragment = ExchangeFragment.newInstance(item)
        parentFragmentManager
            .beginTransaction()
            .add(R.id.fragmentContainer, fragment, item.code)
            .addToBackStack(item.code)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            .commit()
    }

}
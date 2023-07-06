package cd.ghost.genusd.core

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import cd.ghost.genusd.data.model.Currency
import cd.ghost.genusd.databinding.ItemLayoutBinding

class RecyclerAdapter(
    val onItemClick: (item: Currency) -> Unit
) : ListAdapter<Currency, RecyclerAdapter.ViewHolder>(Differ()) {

    inner class ViewHolder(
        private val binding: ItemLayoutBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("SetTextI18n", "ResourceAsColor")
        fun onBind(item: Currency) {
            binding.apply {

                root.setOnClickListener {
                    onItemClick(item)
                }

                tvShortName.text = item.ccy

                tvFullName.text = item.ccyNmUZ

                tvRate.text = item.rate

                tvNominalRate.text =
                    "${item.nominal} ${item.ccy} = ${item.rate} UZS"

                tvLastUpdate.text = item.date

                tvDiff.text = item.diff

                tvDiff.setTextColor(
                    if (item.diff.toDouble() >= 0) Color.parseColor("#50A339")
                    else Color.parseColor("#FF2B2B")
                )
            }
        }
    }

    class Differ : DiffUtil.ItemCallback<Currency>() {
        override fun areItemsTheSame(oldItem: Currency, newItem: Currency): Boolean =
            oldItem === newItem

        override fun areContentsTheSame(oldItem: Currency, newItem: Currency): Boolean =
            oldItem == newItem

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        ItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }
}
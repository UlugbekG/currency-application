package cd.ghost.genusd.screens

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cd.ghost.genusd.R
import cd.ghost.genusd.data.model.CurrencyModel
import cd.ghost.genusd.databinding.ItemLayoutBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners

class RecyclerAdapter(
    val onItemClick: (item: CurrencyModel) -> Unit
) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private val list = ArrayList<CurrencyModel>()

    @SuppressLint("NotifyDataSetChanged")
    fun submitList(newList: List<CurrencyModel>) {
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }

    inner class ViewHolder(
        private val binding: ItemLayoutBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("SetTextI18n", "ResourceAsColor")
        fun onBind(item: CurrencyModel) {
            binding.apply {
                Glide.with(root.context)
                    .load(item.flagIcon)
                    .placeholder(R.drawable.fla_placeholder)
                    .transform(RoundedCorners(12))
                    .into(ivFlag)
                tvShortName.text = item.ccy
                tvFullName.text = item.ccyNmUZ
                tvRate.text = item.rate
                tvLastUpdate.text = item.date
                tvDiff.text =
                    if (item.diff.toDouble() >= 0) "+${item.diff}"
                    else item.diff

                tvDiff.setTextColor(
                    if (item.diff.toDouble() >= 0) Color.parseColor("#50A339")
                    else Color.parseColor("#FF2B2B")
                )
                itemView.setOnClickListener {
                    onItemClick(item)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        ItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
    )

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }
}
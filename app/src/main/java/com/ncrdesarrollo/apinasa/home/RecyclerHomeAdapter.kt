package com.ncrdesarrollo.apinasa.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ncrdesarrollo.apinasa.databinding.ItemMenuHomeBinding

class RecyclerHomeAdapter(private val onClick: (InfoHomeData) -> Unit) : RecyclerView.Adapter<RecyclerHomeAdapter.ViewHolder>() {

    private var optionsList: List<InfoHomeData> = listOf()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding = ItemMenuHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding, onClick)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = optionsList[position]
        holder.bind(item)
    }

    fun setListOptionsHome(optionsHome: List<InfoHomeData>) {
        this.optionsList = optionsHome
    }

    override fun getItemCount() = optionsList.size

    class ViewHolder(
        private val binding: ItemMenuHomeBinding,
        private val onClick: (InfoHomeData) -> Unit
    ) : RecyclerView.ViewHolder(binding.root) {

        private var item: InfoHomeData? = null

        /*init {
            binding.cardView.setOnClickListener { item?.let { it1 -> onClick(it1) } }
        }*/

        fun bind(item: InfoHomeData) {
            with(binding) {
                imageViewIcon.setImageResource(item.icon)
                textViewTitle.text = item.title
                textViewSubtitle2.text = item.subtitle
                cardView.setOnClickListener { item?.let { it1 -> onClick(it1) } }
            }
        }
    }
}

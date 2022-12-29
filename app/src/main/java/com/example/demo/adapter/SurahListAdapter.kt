package com.example.demo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.demo.databinding.ItemSurahRowBinding
import com.example.demo.models.SurahInfo

class SurahListAdapter(
    private var results: List<SurahInfo>,
    private val itemClickListener: OnItemClickListener,
    var context: Context
) : RecyclerView.Adapter<SurahListAdapter.MyViewHolder>() {
    private lateinit var eachRowBinding: ItemSurahRowBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        eachRowBinding = ItemSurahRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(eachRowBinding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = results[position]
        holder.bind(data, itemClickListener)
    }

    override fun getItemCount(): Int = results.size

    class MyViewHolder(eachRowBinding: ItemSurahRowBinding) :
        RecyclerView.ViewHolder(eachRowBinding.root) {
        var eachRowBinding: ItemSurahRowBinding
        init {
            this.eachRowBinding = eachRowBinding
        }
        fun bind(
            data: SurahInfo,
            itemClickListener: OnItemClickListener
        ) {


            eachRowBinding.tvNameAr.text = data.name
            eachRowBinding.tvNameEn.text = data.englishName
            eachRowBinding.tvTranslation.text = data.englishNameTranslation
            eachRowBinding.txtVersesCount.text = data.numberOfAyahs.toString() + " Verses"
            eachRowBinding.cvExpenseList.setOnClickListener {
                itemClickListener.onItemClicked(data)
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClicked(data: SurahInfo)
    }

    fun setData(expensesResponse: List<SurahInfo>) {
        this.results = expensesResponse
        notifyDataSetChanged()
    }
}

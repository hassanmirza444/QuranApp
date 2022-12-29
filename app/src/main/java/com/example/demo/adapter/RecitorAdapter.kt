package com.example.demo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.demo.databinding.ItemVerseRowBinding
import com.example.demo.models.Recitor
import com.example.demo.util.Utilities

class RecitorAdapter(
    private var recitorsList: List<Recitor>,
    private val itemClickListener: OnItemClickListener,
    var context: Context,
) : RecyclerView.Adapter<RecitorAdapter.MyViewHolder>() {
    private lateinit var eachRowBinding: ItemVerseRowBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        eachRowBinding =
            ItemVerseRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(eachRowBinding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = recitorsList[position]
        holder.bind(data, itemClickListener)
    }

    override fun getItemCount(): Int = recitorsList.size

    class MyViewHolder(eachRowBinding: ItemVerseRowBinding) :
        RecyclerView.ViewHolder(eachRowBinding.root) {
        var eachRowBinding: ItemVerseRowBinding

        init {
            this.eachRowBinding = eachRowBinding
        }

        fun bind(
            data: Recitor,
            itemClickListener: OnItemClickListener,
        ) {
            eachRowBinding.tvNameAr.text = data.name
            eachRowBinding.tvNameEn.text = data.englishName
            eachRowBinding.tvVerseCountAr.text = Utilities.EnglishToArabic(data.language.toString())
            eachRowBinding.cvExpenseList.setOnClickListener {
                itemClickListener.onItemClicked(data)
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClicked(data: Recitor)
    }

    fun setData(list: List<Recitor>) {
        this.recitorsList = list
        notifyDataSetChanged()
    }
}

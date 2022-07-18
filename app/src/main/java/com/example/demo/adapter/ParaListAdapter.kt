package com.example.demo.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.demo.databinding.ItemParaRowBinding
import com.example.demo.databinding.ItemSurahRowBinding
import com.example.demo.models.JuzzModel
import com.example.demo.models.ParaInfo
import com.example.demo.models.SurahInfo

class ParaListAdapter(
    private var results: List<JuzzModel>,
    private val itemClickListener: OnItemClickListener,
    var context: Context
) : RecyclerView.Adapter<ParaListAdapter.MyViewHolder>() {
    private lateinit var eachRowBinding: ItemParaRowBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        eachRowBinding = ItemParaRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(eachRowBinding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = results[position]
        holder.bind(data, itemClickListener)
    }

    override fun getItemCount(): Int = results.size

    class MyViewHolder(eachRowBinding: ItemParaRowBinding) :
        RecyclerView.ViewHolder(eachRowBinding.root) {
        var eachRowBinding: ItemParaRowBinding
        init {
            this.eachRowBinding = eachRowBinding
        }
        fun bind(
            data: JuzzModel,
            itemClickListener: OnItemClickListener
        ) {


            eachRowBinding.tvNameAr.text = data.arabicText
            eachRowBinding.tvNameEn.text = "Para No."+data.juzzNo.toString()
            //eachRowBinding.tvTranslation.text = data.surahNo.toString()
            eachRowBinding.tvTranslation.visibility = View.GONE
            eachRowBinding.txtVersesCount.text = data.ayatNo.toString() + " Verses"
            eachRowBinding.cvExpenseList.setOnClickListener {
                itemClickListener.onItemClicked(data)
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClicked(data: JuzzModel)
    }

    fun setData(expensesResponse: List<JuzzModel>) {
        this.results = expensesResponse
        notifyDataSetChanged()
    }
}

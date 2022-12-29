package com.example.demo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.demo.databinding.ItemVerseRowBinding
import com.example.demo.models.Ayah
import com.example.demo.util.Utilities

class VerseAdapter(
    private var resultsInArabic: List<Ayah>,
    private var translatedResultList: List<Ayah>,
    private val itemClickListener: OnItemClickListener,
    var context: Context,
) : RecyclerView.Adapter<VerseAdapter.MyViewHolder>() {
    private lateinit var eachRowBinding: ItemVerseRowBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        eachRowBinding =
            ItemVerseRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(eachRowBinding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = resultsInArabic[position]

        if (translatedResultList.size > position) {
            holder.bind(data, translatedResultList[position], itemClickListener)
        } else {
            holder.bind(data, null, itemClickListener)
        }


    }

    override fun getItemCount(): Int = resultsInArabic.size

    class MyViewHolder(eachRowBinding: ItemVerseRowBinding) :
        RecyclerView.ViewHolder(eachRowBinding.root) {
        var eachRowBinding: ItemVerseRowBinding

        init {
            this.eachRowBinding = eachRowBinding
        }

        fun bind(
            data: Ayah,
            translatedAyah: Ayah?,
            itemClickListener: OnItemClickListener,
        ) {

            if (data.number == 1) {
                eachRowBinding.tvNameAr.text = data.text.plus(Utilities.EnglishToArabicReversed(data.number.toString())+"\u06DD")
            } else {
                eachRowBinding.tvNameAr.text =
                    data.text.replace("بِسْمِ ٱللَّهِ ٱلرَّحْمَٰنِ ٱلرَّحِيمِ", "")
                    .replace("بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ", "")
                        .plus(Utilities.EnglishToArabicReversed(data.number.toString())+"\u06DD")
            }


            eachRowBinding.tvNameEn.text = translatedAyah?.text
            eachRowBinding.tvVerseCountAr.visibility = View.GONE
            eachRowBinding.cvExpenseList.setOnClickListener {
                itemClickListener.onItemClicked(data)
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClicked(data: Ayah)
    }

    fun setData(list: List<Ayah>, translatedList: List<Ayah>) {
        this.resultsInArabic = list
        this.translatedResultList = translatedList
        notifyDataSetChanged()
    }
}

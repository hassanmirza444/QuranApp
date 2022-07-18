package com.example.demo.ui

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.demo.adapter.VerseAdapter
import com.example.demo.databinding.ActivitySurahBinding
import com.example.demo.models.Ayah
import com.example.demo.models.SurahDetailResponse
import com.example.demo.util.ApiState
import com.example.demo.util.Utilities
import com.example.demo.viewmodel.VerseListViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect


@AndroidEntryPoint
class SurahActivity : AppCompatActivity(), VerseAdapter.OnItemClickListener {

    private lateinit var binding: ActivitySurahBinding
    private lateinit var verseAdapter: VerseAdapter
    private lateinit var mContext: Context
    private val verseListViewModel: VerseListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivitySurahBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mContext = this
        verseAdapter = VerseAdapter(ArrayList(), ArrayList(), this, mContext)
        binding.rvVersesList.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@SurahActivity)
            adapter = verseAdapter
        }
        callApi(intent.getIntExtra("surah_id", 1))
        binding.ivInfo.setOnClickListener {
            if (binding.clInfo.visibility==View.GONE) {
                binding.clInfo.visibility = View.VISIBLE
            } else {
                binding.clInfo.visibility = View.GONE
            }
        }
        binding.ivBack.setOnClickListener {
            onBackPressed()
        }
    }

    private fun callApi(id: Int) {
        verseListViewModel.getSurah(id)
        lifecycleScope.launchWhenStarted {
            verseListViewModel.postStateFlow.collect {
                when (it) {
                    is ApiState.Loading -> {
                    }
                    is ApiState.Failure -> {
                        Utilities.showToast(mContext, it.msg.toString())
                    }
                    is ApiState.Success<*> -> {
                        binding.rvVersesList.visibility = View.VISIBLE
                        val result = it.result as SurahDetailResponse
                        binding.tvSurahTitle.text = result.data[0].name
                        binding.tvInfo.text =
                                "  English Name: " + result.data[0].englishName + "\n" +
                                "  Translated English Name: " + result.data[0].englishNameTranslation + "\n" +
                                "  Number of Ayah: "+ result.data[0].numberOfAyahs + "\n" +
                                "  Revelation Type: " +result.data[0].revelationType
                        if (result.data.size > 1)
                            verseAdapter.setData(result.data[0].ayahs!!, result.data[1].ayahs!!)
                        else
                            verseAdapter.setData(result.data[0].ayahs!!, ArrayList())
                    }
                    is ApiState.Empty -> {

                    }
                }
            }
        }
    }

    override fun onItemClicked(data: Ayah) {

    }
}
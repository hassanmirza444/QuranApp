package com.example.demo.ui

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.demo.adapter.VerseAdapter
import com.example.demo.cons.Cons
import com.example.demo.databinding.ActivityParaBinding
import com.example.demo.models.Ayah
import com.example.demo.models.ParahDetailResponse
import com.example.demo.util.ApiState
import com.example.demo.util.Utilities
import com.example.demo.viewmodel.VerseListViewModel
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import org.json.JSONObject

@AndroidEntryPoint
class ParaActivity : AppCompatActivity(), VerseAdapter.OnItemClickListener {
    lateinit var binding: ActivityParaBinding
    private lateinit var verseAdapter: VerseAdapter
    private lateinit var mContext: Context
    private val verseListViewModel: VerseListViewModel by viewModels()
    private var para_id = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityParaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mContext = this
        verseAdapter = VerseAdapter(ArrayList(), ArrayList(), this, mContext)
        binding.rvVersesList.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@ParaActivity)
            adapter = verseAdapter
        }
        para_id = intent.getIntExtra("parah_id", 1)
        callApi(para_id)
        binding.ivInfo.setOnClickListener {
            if (binding.clInfo.visibility == View.GONE) {
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
        verseListViewModel.getParah(id)
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
                        val result = it.result as ParahDetailResponse
                        binding.tvParahTitle.text = Cons.juzzStartingWord[id - 1]
                        binding.tvInfo.text = ""
                        verseAdapter.setData(result.data.ayahs!!, ArrayList())
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
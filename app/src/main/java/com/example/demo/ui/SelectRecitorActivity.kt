package com.example.demo.ui

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.demo.adapter.RecitorAdapter
import com.example.demo.databinding.ActivitySelectRecitorBinding
import com.example.demo.models.Recitor
import com.example.demo.models.RecitorsResponse
import com.example.demo.util.ApiState
import com.example.demo.util.QuranAppSharedPreferences
import com.example.demo.util.Utilities
import com.example.demo.viewmodel.RecitorListViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect

@AndroidEntryPoint
class SelectRecitorActivity : AppCompatActivity(), RecitorAdapter.OnItemClickListener {

    lateinit var binding: ActivitySelectRecitorBinding
    lateinit var recitorAdapter: RecitorAdapter
    lateinit var mContext: Context
    private val recitorListViewModel: RecitorListViewModel by viewModels()
    private lateinit var type: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectRecitorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mContext = this
        recitorAdapter = RecitorAdapter(ArrayList(), this, mContext)
        binding.rvRecitors.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@SelectRecitorActivity)
            adapter = recitorAdapter
        }
        type = intent.getStringExtra("type").toString()
        callApi(type)
    }

    private fun callApi(type: String) {
        recitorListViewModel.getAllRecitorsListofGivenType(type)
        lifecycleScope.launchWhenStarted {
            recitorListViewModel.postStateFlow.collect {
                when (it) {
                    is ApiState.Loading -> {
                    }
                    is ApiState.Failure -> {
                        Utilities.showToast(mContext, it.msg.toString())
                    }
                    is ApiState.Success<*> -> {
                        binding.rvRecitors.visibility = View.VISIBLE
                        val result = it.result as RecitorsResponse
                        recitorAdapter.setData(result.data)
                    }
                    is ApiState.Empty -> {

                    }
                }
            }
        }
    }

    override fun onItemClicked(data: Recitor) {
        Toast.makeText(mContext, "Done" + data.englishName, Toast.LENGTH_LONG).show()
        if (type.equals("quran")) {
            QuranAppSharedPreferences.instance!!.setQuranRecitor(data.identifier)
        } else if (type.equals("translation")) {
            QuranAppSharedPreferences.instance!!.setTranslationRecitor(data.identifier)
        } else if (type.equals("transliteration")) {
            QuranAppSharedPreferences.instance!!.setTransliterationRecitor(data.identifier)
        } else if (type.equals("tafsir")) {
            QuranAppSharedPreferences.instance!!.setTafsirRecitor(data.identifier)
        }
        finish()
    }
}
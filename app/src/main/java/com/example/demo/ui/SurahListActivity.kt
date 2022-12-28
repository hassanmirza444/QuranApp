package com.example.demo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demo.adapter.SurahListAdapter
import com.example.demo.database.AlertViewModel
import com.example.demo.databinding.ActivitySurahListBinding
import com.example.demo.models.SurahInfo
import com.example.demo.models.SurahInfoResponse
import com.example.demo.util.ApiState
import com.example.demo.util.Utilities.showToast
import com.example.demo.viewmodel.SurahListViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect

@AndroidEntryPoint
class SurahListActivity : AppCompatActivity(), SurahListAdapter.OnItemClickListener {
    private lateinit var binding: ActivitySurahListBinding
    private lateinit var surahListAdapter: SurahListAdapter
    private lateinit var context: Context

    private val mainViewModel: SurahListViewModel by viewModels()
    private val alertViewModel: AlertViewModel by viewModels()
    private var alertsList: List<SurahInfo> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySurahListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        intializeViews()
        intializeData()
    }

    fun intializeViews() {
        context = this
        surahListAdapter = SurahListAdapter(ArrayList(), this, context)
        binding.rvSurahList.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@SurahListActivity)
            adapter = surahListAdapter
        }
        ItemTouchHelper(object : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT) {
            override fun onMove(
                v: RecyclerView,
                h: RecyclerView.ViewHolder,
                t: RecyclerView.ViewHolder,
            ) = false

            override fun onSwiped(h: RecyclerView.ViewHolder, dir: Int) =
                deleteItemFromDb(h.adapterPosition)
        }).attachToRecyclerView(binding.rvSurahList)
    }

    private fun deleteItemFromDb(adapterPosition: Int) {
        alertViewModel.delete(alertsList.get(adapterPosition))
    }

    private fun callApi() {
        val mHashMap = HashMap<String, Any>()
        mHashMap["request_param"] = "Value"
        mHashMap["page"] = "1"
        mainViewModel.getAllSurahList(mHashMap)
        lifecycleScope.launchWhenStarted {
            mainViewModel.postStateFlow.collect { it ->
                when (it) {
                    is ApiState.Loading -> {
                    }
                    is ApiState.Failure -> {
                        showToast(context, it.msg.toString())
                    }
                    is ApiState.Success<*> -> {
                        binding.rvSurahList.visibility = View.VISIBLE
                        val result = it.result as SurahInfoResponse
                        alertsList = result.data
                        surahListAdapter.setData(alertsList)
                        for (i in 0 until result.data.size) {
                            //saving to db
                            alertViewModel.insert(result.data.get(i))
                        }
                    }
                    is ApiState.Empty -> {

                    }
                }
            }
        }
    }

    fun intializeData() {
        alertViewModel.getSurahList.observe(this, Observer { response ->
            alertsList = (response as ArrayList<SurahInfo>)
            if (alertsList.size > 0) {
                //load from db
                surahListAdapter.setData(response)
            } else {
                // get data from server
                callApi()
            }
        })
    }

    override fun onItemClicked(data: SurahInfo) {
        val intent = Intent(this@SurahListActivity, SurahActivity::class.java)
            .apply {
                putExtra("surah_id", data.number)
            }
        startActivity(intent)
    }


}



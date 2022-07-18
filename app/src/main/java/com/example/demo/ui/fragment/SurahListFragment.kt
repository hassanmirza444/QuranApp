package com.example.demo.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.demo.adapter.SurahListAdapter
import com.example.demo.database.AlertViewModel
import com.example.demo.databinding.SurahListFragmentBinding
import com.example.demo.models.SurahInfo
import com.example.demo.models.SurahInfoResponse
import com.example.demo.ui.SurahActivity
import com.example.demo.util.ApiState
import com.example.demo.util.Utilities
import com.example.demo.viewmodel.SurahListViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect

@AndroidEntryPoint
class SurahListFragment : Fragment(), SurahListAdapter.OnItemClickListener {

    companion object {
        fun newInstance() = SurahListFragment()
    }

    private val viewModel: SurahListViewModel by viewModels()
    private lateinit var binding: SurahListFragmentBinding
    private lateinit var surahListAdapter: SurahListAdapter
    private val alertViewModel: AlertViewModel by viewModels()
    private var alertsList: List<SurahInfo> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = SurahListFragmentBinding.inflate(layoutInflater,container,false)
        return binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
   //     viewModel = ViewModelProvider(this).get(SurahListViewModel::class.java)
        intializeViews()
        intializeData()
    }

    private fun intializeData() {
        callApi()
      /*  alertViewModel.getSurahList.observe(viewLifecycleOwner, Observer { response ->
            alertsList = (response as ArrayList<SurahInfo>)
            if (alertsList.isNotEmpty()) {
                //load from db
                surahListAdapter.setData(response)
            } else {
                // get data from server
                callApi()
            }
        })*/
    }

    private fun callApi() {
        val mHashMap = HashMap<String, Any>()
        mHashMap["request_param"] = "Value"
        mHashMap["page"] = "1"
        viewModel.getAllSurahList(mHashMap)
        lifecycleScope.launchWhenStarted {
            viewModel.postStateFlow.collect { it ->
                when (it) {
                    is ApiState.Loading -> {
                    }
                    is ApiState.Failure -> {
                        Utilities.showToast(requireContext(), it.msg.toString())
                    }
                    is ApiState.Success<*> -> {
                        binding.rvSurah.visibility = View.VISIBLE
                        val result = it.result as SurahInfoResponse
                        alertsList = result.data
                        surahListAdapter.setData(alertsList)
                      /*  for (i in 0 until result.data.size) {
                            //saving to db
                            alertViewModel.insert(result.data.get(i))
                        }*/
                    }
                    is ApiState.Empty -> {

                    }
                }
            }
        }
    }

    fun intializeViews() {
        surahListAdapter = SurahListAdapter(ArrayList(), this, requireContext())
        binding.rvSurah.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(requireContext())
            adapter = surahListAdapter
        }
    }

    override fun onItemClicked(data: SurahInfo) {
        val intent = Intent(requireContext(), SurahActivity::class.java)
            .apply {
                putExtra("surah_id", data.number)
            }
        startActivity(intent)
    }

}
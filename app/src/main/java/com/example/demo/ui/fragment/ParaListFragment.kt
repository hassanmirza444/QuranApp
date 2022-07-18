package com.example.demo.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.demo.adapter.ParaListAdapter
import com.example.demo.cons.Cons.PARAH_SURAH_AYAH
import com.example.demo.cons.Cons.juzzStartingWord
import com.example.demo.database.AlertViewModel
import com.example.demo.databinding.ParaListFragmentBinding
import com.example.demo.models.JuzzModel
import com.example.demo.ui.ParaActivity
import com.example.demo.ui.SurahActivity
import com.example.demo.viewmodel.ParaListViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ParaListFragment : Fragment(), ParaListAdapter.OnItemClickListener {

    companion object {
        fun newInstance() = ParaListFragment()
    }

    private lateinit var binding: ParaListFragmentBinding
    private val viewModel: ParaListViewModel by viewModels()
    private lateinit var paraListAdapter: ParaListAdapter
    private val alertViewModel: AlertViewModel by viewModels()
    private var paraList: List<JuzzModel> = ArrayList()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = ParaListFragmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        intializeViews()
        intializeData()
    }


    fun intializeData() {
        callApi()
    }

    private fun callApi() {
        for (i in 0..29) {
            var surahNo = PARAH_SURAH_AYAH.get(i).get(0)
            var ayatNo = PARAH_SURAH_AYAH.get(i).get(1)
            var juzzModel = JuzzModel(i + 1,
                juzzStartingWord.get(i),
                surahNo,
                ayatNo)
            paraList = paraList.plus(juzzModel)
        }
        paraListAdapter.setData(paraList)
    }


    fun intializeViews() {
        paraListAdapter = ParaListAdapter(ArrayList(), this, requireContext())
        binding.rvPara.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(requireContext())
            adapter = paraListAdapter
        }
    }

    override fun onItemClicked(data: JuzzModel) {
        val intent = Intent(requireContext(), ParaActivity::class.java)
            .apply {
                putExtra("parah_id", data.juzzNo)
            }
        startActivity(intent)
    }


}
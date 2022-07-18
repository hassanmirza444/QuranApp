package com.example.demo.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.demo.databinding.FragmentHomeBinding
import com.example.demo.ui.QuranActivity
import com.example.demo.viewmodel.HomeViewModel

class HomeFragment : Fragment() {

    private var fragmentHomeBinding: FragmentHomeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        fragmentHomeBinding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = fragmentHomeBinding!!.root


        fragmentHomeBinding!!.textHome.setOnClickListener {
             startActivity(Intent(requireContext(), QuranActivity::class.java))


        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        fragmentHomeBinding = null
    }
}
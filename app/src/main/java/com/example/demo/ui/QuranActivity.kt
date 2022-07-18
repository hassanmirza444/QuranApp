package com.example.demo.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demo.adapter.QuranPagerAdapter
import com.example.demo.databinding.ActivityQuranBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class QuranActivity : AppCompatActivity() {
    lateinit var binding: ActivityQuranBinding
    private lateinit var quranPagerAdapter: QuranPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuranBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Surah"));
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Para"));
        quranPagerAdapter = QuranPagerAdapter(supportFragmentManager,binding.tabLayout.tabCount)
        binding.pager.adapter = quranPagerAdapter
        binding.pager.addOnPageChangeListener(TabLayoutOnPageChangeListener(binding.tabLayout))
        binding.tabLayout.addOnTabSelectedListener(object :TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                binding.pager.setCurrentItem(tab!!.getPosition());
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })

    }

}
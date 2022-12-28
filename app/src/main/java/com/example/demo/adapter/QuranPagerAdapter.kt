package com.example.demo.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.demo.ui.fragment.ParaListFragment
import com.example.demo.ui.fragment.SurahListFragment

class QuranPagerAdapter(fm: FragmentManager, tabCountt : Int) : FragmentStatePagerAdapter(fm) {

    var tabCount: Int = tabCountt
    override fun getCount(): Int = tabCount

    override fun getItem(i: Int): Fragment {
        if (i == 0) {
            val fragment = SurahListFragment()
            fragment.arguments = Bundle().apply { putInt("", i + 1) }
            return fragment
        } else {
            val fragment = ParaListFragment()
            fragment.arguments = Bundle().apply { putInt("", i + 1) }
            return fragment
        }

    }

    override fun getPageTitle(position: Int): CharSequence {
        return "OBJECT ${(position + 1)}"
    }
}
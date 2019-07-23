package com.minwook.mytriphistory.kotlin.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.minwook.mytriphistory.java.ui.fragment.ContentsFragment
import com.minwook.mytriphistory.java.ui.fragment.MapFragment

class MainTabAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {

    private val tabTitle = arrayOf("리스트", "지도")

    override fun getItem(position: Int): Fragment {
        val fragment = when(position) {
            0 -> ContentsFragment.newInstance()
            1 -> MapFragment.newInstance()
            else -> ContentsFragment.newInstance()
        }

        return fragment
    }

    override fun getCount(): Int {
        return tabTitle.size
    }
}
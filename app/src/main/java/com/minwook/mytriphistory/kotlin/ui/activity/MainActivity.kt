package com.minwook.mytriphistory.kotlin.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.minwook.mytriphistory.R
import com.minwook.mytriphistory.java.adapter.MainTabAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainTabAdapter = MainTabAdapter(supportFragmentManager)
        viewPager.adapter = mainTabAdapter

        tabLayout.setupWithViewPager(viewPager)
    }
}
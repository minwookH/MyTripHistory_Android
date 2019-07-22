package com.minwook.mytriphistory.kotlin.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.minwook.mytriphistory.R
import com.minwook.mytriphistory.adapter.MainTabAdapter

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout: TabLayout = findViewById(R.id.tabLayout)
        val viewPager: ViewPager = findViewById(R.id.viewPager)

        val mainTabAdapter = MainTabAdapter(supportFragmentManager)
        //viewPager.setAdapter(mainTabAdapter)
        viewPager.adapter = mainTabAdapter

        tabLayout.setupWithViewPager(viewPager)
    }
}
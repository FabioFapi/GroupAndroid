package com.itsmad.gamescout

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        viewPager.adapter = PagesAdapter(this)


        val tabLayout = findViewById<TabLayout>(R.id.tabsLayouts)
        TabLayoutMediator(tabLayout, viewPager) {tab, position ->
            tab.text = "OBJECT ${(position + 1)}"
        }.attach()
    }
}

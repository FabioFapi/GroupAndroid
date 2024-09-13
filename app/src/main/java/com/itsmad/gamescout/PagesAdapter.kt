package com.itsmad.gamescout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.itsmad.gamescout.Pages.AboutFragment
import com.itsmad.gamescout.Pages.ContactFragment
import com.itsmad.gamescout.Pages.HomeFragment

class PagesAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {

    override fun getItemCount(): Int = 3


    override fun createFragment(position: Int): Fragment {
    return when (position) {
        0 -> HomeFragment()
        1 -> AboutFragment()
        2 -> ContactFragment()
        else -> throw IllegalArgumentException("Posizione non valida")
        }
    }
}
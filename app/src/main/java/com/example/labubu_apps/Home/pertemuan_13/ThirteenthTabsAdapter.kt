package com.example.labubu_apps.Home.pertemuan_13

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.labubu_apps.Home.pertemuan_13.TabCaptureFragment
import com.example.labubu_apps.home.pertemuan_13.TabQrcodeFragment
import com.example.labubu_apps.home.pertemuan_13.TabScanFragment

class ThirteenthTabsAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> TabCaptureFragment()
            1 -> TabScanFragment()
            2 -> TabQrcodeFragment()
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }
}

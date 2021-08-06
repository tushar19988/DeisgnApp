package com.example.deisgnapp.materialdesign.tabslayout

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.deisgnapp.materialdesign.bootamneivitaion.HomeFragment
import com.example.deisgnapp.materialdesign.bootamneivitaion.ui.DashboardFragment
import com.example.deisgnapp.materialdesign.bootamneivitaion.ui.NotificationsFragment

class MyAdapter(val context: Context, fm: FragmentManager, val tabCount: Int):FragmentPagerAdapter(fm) {


    override fun getItem(position: Int): Fragment {
        return when(position){
            0->{
               HomeFragment()
            }
            1-> {
                DashboardFragment()
            }

            2->{
             NotificationsFragment()
            }
            else -> getItem(position)

        }

    }


    override fun getCount(): Int {
        return tabCount
    }
}
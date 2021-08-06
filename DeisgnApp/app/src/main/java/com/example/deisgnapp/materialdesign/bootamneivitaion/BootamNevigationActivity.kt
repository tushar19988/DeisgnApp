package com.example.deisgnapp.materialdesign.bootamneivitaion

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.deisgnapp.R
import com.example.deisgnapp.materialdesign.bootamneivitaion.ui.DashboardFragment
import com.example.deisgnapp.materialdesign.bootamneivitaion.ui.NotificationsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class BootamNevigationActivity : AppCompatActivity() {
    var nav_view: BottomNavigationView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bootam_nevigation)

        fragmentCall(HomeFragment())
        nav_view =findViewById<BottomNavigationView>(R.id.nav_view)

        nav_view?.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        nav_view?.itemIconTintList=null


    }

    private  val mOnNavigationItemSelectedListener=BottomNavigationView.OnNavigationItemSelectedListener { item ->

        when(item.itemId){
            R.id.navigation_home->{
                fragmentCall(HomeFragment())
                return@OnNavigationItemSelectedListener true

            }
            R.id.navigation_dashboard->{
                fragmentCall(DashboardFragment())
                return@OnNavigationItemSelectedListener true

            }
            R.id.navigation_notifications->{
                fragmentCall(NotificationsFragment())
                return@OnNavigationItemSelectedListener true

            }
        }

    false
    }

    private fun fragmentCall(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.nav_host_bootam_nevigation,fragment).commit()
    }

}
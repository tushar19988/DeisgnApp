package com.example.deisgnapp.materialdesign.tabslayout

import android.os.Bundle
import com.example.deisgnapp.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class TabActivity : AppCompatActivity() {
lateinit var  tabs: TabLayout
lateinit var  view_pager: ViewPager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab)




        val fab: FloatingActionButton =findViewById(R.id.fab)
        tabs =findViewById<TabLayout>(R.id.tabs)
        view_pager =findViewById<ViewPager>(R.id.view_pager)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        tabs.addTab(tabs.newTab().setText("CHAT"))
        tabs.addTab(tabs.newTab().setText("CAll"))
        tabs.addTab(tabs.newTab().setText("STATUS"))

        tabs.tabGravity=TabLayout.GRAVITY_FILL

        val adapter=MyAdapter(this,supportFragmentManager,tabs.tabCount)
        view_pager.adapter=adapter
        view_pager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabs))

        tabs.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                view_pager.currentItem= tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

        })















    }
}
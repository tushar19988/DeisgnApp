package com.example.deisgnapp.materialdesign

import android.os.Bundle
import android.view.*
import android.widget.AdapterView
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.deisgnapp.R
import com.example.deisgnapp.materialdesign.bootamneivitaion.GalleryFragment
import com.example.deisgnapp.materialdesign.bootamneivitaion.HomeFragment
import com.example.deisgnapp.materialdesign.bootamneivitaion.SlideshowFragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView
import com.google.android.material.snackbar.Snackbar


class NavigationActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {
    var drawer_layout: DrawerLayout?=null
    var nav_view: NavigationView?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)
        val toolbar: Toolbar =findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        fragmentCall(HomeFragment())

         drawer_layout =findViewById<DrawerLayout>(R.id.drawer_layout)
         nav_view =findViewById<NavigationView>(R.id.nav_view)

       val fab: FloatingActionButton =findViewById(R.id.fab)
        fab.setOnClickListener { view->
            Snackbar.make(view,"Replace with your own action",Snackbar.LENGTH_LONG).setAction("Action",null).show()
        }


        val drawerToggle=ActionBarDrawerToggle(this,drawer_layout,R.string.open,R.string.close)
        drawer_layout!!.addDrawerListener(drawerToggle)
        drawerToggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        drawerToggle.isDrawerIndicatorEnabled=false
        drawerToggle.setHomeAsUpIndicator(R.drawable.ic_menu)


        nav_view?.setNavigationItemSelectedListener(this)

    }



    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.navigation, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                drawer_layout!!.openDrawer(GravityCompat.START)
                true
            }
            R.id.actionHome -> {
                Toast.makeText(applicationContext, "click on setting", Toast.LENGTH_LONG).show()
                true
            }
            R.id.actionSettings ->{
                Toast.makeText(applicationContext, "click on share", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.actionLogout ->{
                Toast.makeText(applicationContext, "click on exit", Toast.LENGTH_LONG).show()
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }




    private fun fragmentCall(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.nav_hostFrameLayout,fragment).commit()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.nav_home->{
                fragmentCall(HomeFragment())
            }
            R.id.nav_gallery->{
                fragmentCall(GalleryFragment())
            }

            R.id.nav_slideshow->{
                fragmentCall(SlideshowFragment())
            }


        }
        drawer_layout?.closeDrawer(GravityCompat.START)
        return true
    }





    override fun onBackPressed() {
        if (drawer_layout!!.isDrawerOpen(GravityCompat.START)) {
            drawer_layout!!.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}
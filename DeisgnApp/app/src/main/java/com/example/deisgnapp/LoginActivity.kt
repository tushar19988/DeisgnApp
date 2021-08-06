package com.example.deisgnapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import com.example.deisgnapp.intentdata.HomeActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        intiView()

    }

    private fun intiView() {

        val btnLogin=findViewById<Button>(R.id.btnLogin)


        btnLogin.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this,btnLogin)
            popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId){
                    R.id.popHome ->

                        Toast.makeText(this, "You Clicked popHome : " + item.title, Toast.LENGTH_SHORT).show()
                    R.id.popSetting ->
                        Toast.makeText(this, "You Clicked  popSetting: " + item.title, Toast.LENGTH_SHORT).show()
                    R.id.popLogout ->
                        Toast.makeText(this, "You Clicked  popLogout " + item.title, Toast.LENGTH_SHORT).show()
                }
                true

            })

            popupMenu.show()



        }


    }
}
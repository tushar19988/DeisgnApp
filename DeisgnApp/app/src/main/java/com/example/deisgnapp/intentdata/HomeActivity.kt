package com.example.deisgnapp.intentdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.deisgnapp.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        intiView()
    }

    private fun intiView() {
        Toast.makeText(this,"Welcome to home",Toast.LENGTH_LONG).show()
        val txtEmail=findViewById<TextView>(R.id.txtEmail)
        val txtPassword=findViewById<TextView>(R.id.txtPassword)

        txtEmail.text=intent.getStringExtra("EMAIL")
        txtPassword.text=intent.getStringExtra("PASSWORD")



    }
}
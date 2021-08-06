package com.example.deisgnapp.intentdata

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.annotation.RequiresApi
import com.example.deisgnapp.R

class SignInActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        intiView()

    }

    private fun intiView() {

        val btnSignIn=findViewById<Button>(R.id.btnSignIn)
        val edtEmail=findViewById<EditText>(R.id.edtEmail)
        val EdtPassword=findViewById<EditText>(R.id.EdtPassword)

        btnSignIn.setOnClickListener {
            if (edtEmail.text.toString().trim().isEmpty()){
                edtEmail.error="Can't Black"
                edtEmail.isFocusable=true
            }else if(EdtPassword.text.toString().trim().isEmpty()){
                EdtPassword.error="Can't Black"
                EdtPassword.isFocusable=true
            }else{

                val intent=Intent(this,HomeActivity::class.java)
                intent.putExtra("EMAIL",edtEmail.text.toString().trim())
                intent.putExtra("PASSWORD",EdtPassword.text.toString().trim())

                startActivity(intent)
            }

        }


    }
}
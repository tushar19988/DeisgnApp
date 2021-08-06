package com.example.deisgnapp.intentdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.deisgnapp.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        intiView()
    }

    private fun intiView() {
        Toast.makeText(this,"Welcome to home", Toast.LENGTH_LONG).show()
        val txtEmail=findViewById<TextView>(R.id.txtEmail)
        val txtPassword=findViewById<TextView>(R.id.txtPassword)

        val btnBack=findViewById<Button>(R.id.btnBack)

        val edtNo=findViewById<EditText>(R.id.edtNo)
        val edtAddress=findViewById<EditText>(R.id.edtAddress)


        txtEmail.text=intent.getStringExtra("EMAIL")
        txtPassword.text=intent.getStringExtra("PASSWORD")


        btnBack.setOnClickListener {

            if (edtNo.text.toString().trim().isEmpty()){
                edtNo.error="Can't Black"
                edtNo.isFocusable=true
            }else if(edtAddress.text.toString().trim().isEmpty()){
                edtAddress.error="Can't Black"
                edtAddress.isFocusable=true
            }else{

                intent.putExtra("NUMBER",edtNo.text.toString().trim())
                intent.putExtra("ADDRESS",edtAddress.text.toString().trim())
                setResult(100,intent)
                finish()

            }


        }



    }
}
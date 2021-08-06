package com.example.deisgnapp.intentdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.deisgnapp.R

class FirstActivity : AppCompatActivity() {
    var txtNo:TextView?=null
    var txtAddress:TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        intiView()

    }

    private fun intiView() {

        val btnSignIn=findViewById<Button>(R.id.btnSignIn)
        val edtEmail=findViewById<EditText>(R.id.edtEmail)
        val EdtPassword=findViewById<EditText>(R.id.EdtPassword)
         txtNo=findViewById<TextView>(R.id.txtNo)
         txtAddress=findViewById<TextView>(R.id.txtAddress)


        btnSignIn.setOnClickListener {
            if (edtEmail.text.toString().trim().isEmpty()){
                edtEmail.error="Can't Black"
                edtEmail.isFocusable=true
            }else if(EdtPassword.text.toString().trim().isEmpty()){
                EdtPassword.error="Can't Black"
                EdtPassword.isFocusable=true
            }else{

                val intent= Intent(this,SecondActivity::class.java)
                intent.putExtra("EMAIL",edtEmail.text.toString().trim())
                intent.putExtra("PASSWORD",EdtPassword.text.toString().trim())
                startActivityForResult(intent,100)

            }

        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode==100){
            txtNo?.visibility=View.VISIBLE
            txtAddress?.visibility=View.VISIBLE
            txtNo?.text=data?.getStringExtra("NUMBER")
            txtAddress?.text=data?.getStringExtra("ADDRESS")

        }
    }
}
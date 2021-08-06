package com.example.deisgnapp.widget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import com.example.deisgnapp.R
import java.lang.StringBuilder

class CheckbBoxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkb_box)
        intiView()

    }

    private fun intiView() {

        val chk1=findViewById<CheckBox>(R.id.chk1)
        val chk2=findViewById<CheckBox>(R.id.chk2)
        val chk3=findViewById<CheckBox>(R.id.chk3)
        val btnSubmit=findViewById<Button>(R.id.btnSubmit)

        btnSubmit.setOnClickListener {
            var TotalPesa:Int=0
            val totalResult=StringBuilder()
            totalResult.append("Selected Item")
            if(chk1.isChecked){
                totalResult.append("\n 100rs Samosa")
                TotalPesa +=100

            }
            if(chk2.isChecked){
                totalResult.append("\n 100rs pakoda")
                TotalPesa +=100

            }

            if(chk3.isChecked){
                totalResult.append("\n 100rs panipur")
                TotalPesa +=100

            }

            totalResult.append("\n Total Result "+ TotalPesa+ "Rs")
            Toast.makeText(this,totalResult,Toast.LENGTH_LONG).show()

        }






    }
}
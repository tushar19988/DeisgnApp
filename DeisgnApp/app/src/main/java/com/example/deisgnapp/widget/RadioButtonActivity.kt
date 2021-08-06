package com.example.deisgnapp.widget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.deisgnapp.R

class RadioButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)
        intiView()

    }

    private fun intiView() {


        val radioGroup   = findViewById<RadioGroup>(R.id.radioGroup)
        radioGroup.setOnCheckedChangeListener { group, checkedId ->

            var text="You Are Selected: "
            text +=if(R.id.rdMale==checkedId) "Male" else "Female"
            Toast.makeText(this,text,Toast.LENGTH_LONG).show()
        }





    }
}
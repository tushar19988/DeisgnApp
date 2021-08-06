package com.example.deisgnapp.widget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.widget.PopupMenu
import com.example.deisgnapp.R

class SpinnerActivity : AppCompatActivity(),AdapterView.OnItemSelectedListener {
    var language= arrayOf("Java","Python","RoR","Asp")
    lateinit var txtLan: TextView
    lateinit var spinner: Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)
        intiView()

    }

    private fun intiView() {

        spinner=findViewById<Spinner>(R.id.spinner)
        txtLan=findViewById<TextView>(R.id.txtLan)


        spinner.onItemSelectedListener=this


        val sAdpter=ArrayAdapter(this,android.R.layout.simple_spinner_item,language)
        sAdpter.setDropDownViewResource(android.R.layout.simple_spinner_item)


        spinner.adapter=sAdpter




    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
      txtLan.text=language[position]
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
    }
}
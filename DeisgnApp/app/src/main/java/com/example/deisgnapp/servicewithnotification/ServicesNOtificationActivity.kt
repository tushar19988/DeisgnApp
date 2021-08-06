package com.example.deisgnapp.servicewithnotification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.content.ContextCompat
import com.example.deisgnapp.R

class ServicesNOtificationActivity : AppCompatActivity() {
    lateinit var edtName: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_services_notification)
        intiView()

    }

    private fun intiView() {

        val btnStart = findViewById<Button>(R.id.btnStart)
        val btnStop = findViewById<Button>(R.id.btnStop)

        edtName = findViewById<EditText>(R.id.edtName)
        btnStart.setOnClickListener {
            val name=edtName.text.toString()
            val serviceIntent =Intent(this,MyService::class.java)
            serviceIntent.putExtra("INPUT_NAME",name)
            ContextCompat.startForegroundService(this,serviceIntent)





        }

        btnStop.setOnClickListener {
            val serviceIntent =Intent(this,MyService::class.java)
            stopService(serviceIntent)
        }





    }
}
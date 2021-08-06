package com.example.deisgnapp.intentdata

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.deisgnapp.R

class ImplicitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit)
        intiView()

    }

    private fun intiView() {

        val btnShare=findViewById<Button>(R.id.btnShare)

        btnShare.setOnClickListener {

           val intent=Intent(Intent.ACTION_VIEW)
           intent.setData(Uri.parse("http://waytocode.in/"))
            startActivity(intent)

         /*   val intent=Intent(android.content.Intent.ACTION_SEND)
            intent.setType("text/plain")
            intent.putExtra(Intent.EXTRA_SUBJECT,"demo text sending")
            intent.putExtra(android.content.Intent.EXTRA_TEXT,"hi this is vinod sonava")
            startActivity(Intent.createChooser(intent,"share data"))*/







        }








    }


}
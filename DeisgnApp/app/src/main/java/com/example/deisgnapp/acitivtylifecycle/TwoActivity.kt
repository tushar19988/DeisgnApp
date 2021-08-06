package com.example.deisgnapp.acitivtylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.deisgnapp.R

class TwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)
        intiView()
        Log.d("TAG","onCreate TwoActivity")

    }
    override fun onStart() {
        super.onStart()
        Log.d("TAG","onStart TwoActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG","onResume TwoActivity")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG","onPause TwoActivity")
    }


    override fun onStop() {
        super.onStop()
        Log.d("TAG","onStop TwoActivity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("TAG","onRestart TwoActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG","onDestroy TwoActivity")
    }
    private fun intiView() {
        val btnBack=findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
           finish()
        }
    }

}
package com.example.deisgnapp.acitivtylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.deisgnapp.R
import com.example.deisgnapp.intentdata.SecondActivity

class OneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

        Log.d("TAG","onCreate OneActivity")

        intiView()

    }

    override fun onStart() {
        super.onStart()
        Log.d("TAG","onStart OneActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG","onResume OneActivity")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG","onPause OneActivity")
    }


    override fun onStop() {
        super.onStop()
        Log.d("TAG","onStop OneActivity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("TAG","onRestart OneActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG","onDestroy OneActivity")
    }

    private fun intiView() {
        val btnNext=findViewById<Button>(R.id.btnNext)
        btnNext.setOnClickListener {
            val intent= Intent(this, TwoActivity::class.java)
            startActivity(intent)
        }
    }

}
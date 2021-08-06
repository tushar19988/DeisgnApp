package com.example.deisgnapp.widget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.Spinner
import android.widget.TextView
import com.example.deisgnapp.R

class SeekBarActivity : AppCompatActivity(),SeekBar.OnSeekBarChangeListener {
    lateinit var seekBar: SeekBar
    lateinit var txtProgress: TextView
    lateinit var txtStatus: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seek_bar)
        intiView()

    }

    private fun intiView() {

        seekBar = findViewById<SeekBar>(R.id.seekBar)
        txtProgress = findViewById<TextView>(R.id.txtProgress)
        txtStatus = findViewById<TextView>(R.id.txtStatus)

        seekBar.setOnSeekBarChangeListener(this)



    }

    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
        txtProgress.text=progress.toString()
        txtStatus.text="Tracking Touch"

    }

    override fun onStartTrackingTouch(seekBar: SeekBar?) {
        txtStatus.text="Started Tracking Touch"

    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {
        txtStatus.text="Stopped Tracking Touch"

    }
}
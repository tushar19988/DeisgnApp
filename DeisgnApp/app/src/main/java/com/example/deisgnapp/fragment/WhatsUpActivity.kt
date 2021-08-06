package com.example.deisgnapp.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.deisgnapp.R

class WhatsUpActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_whats_up)
        intiView()

        fragmentCall(ChatFragment())
    }

    private fun fragmentCall(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).commit()
    }


    private fun intiView() {
        val btnChat=findViewById<Button>(R.id.btnChat)
        val btnStatus=findViewById<Button>(R.id.btnStatus)
        val btnCall=findViewById<Button>(R.id.btnCall)
        btnChat.setOnClickListener(this)
        btnStatus.setOnClickListener(this)
        btnCall.setOnClickListener(this)


        /*   btnChat.setOnClickListener {
               fragmentCall(ChatFragment())
           }
           btnStatus.setOnClickListener {
               fragmentCall(StatusFragment())
           }
           btnCall.setOnClickListener {
               fragmentCall(CallFragment())

           }
   */


    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnChat->{
                fragmentCall(ChatFragment())
            }

            R.id.btnStatus->{
                    fragmentCall(StatusFragment())

            }
            R.id.btnCall->{
                fragmentCall(CallFragment())
            }
        }
    }


}
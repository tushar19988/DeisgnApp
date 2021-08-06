package com.example.deisgnapp.widget

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.deisgnapp.R
import java.lang.StringBuilder

class DialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)
        intiView()

    }

    private fun intiView() {


        val btnSubmit=findViewById<Button>(R.id.btnSubmit)

/*
        btnSubmit.setOnClickListener {
val builder=AlertDialog.Builder(this)
            builder.setTitle("Logout")
            builder.setMessage("Do u want to logout ?")
            builder.setIcon(R.drawable.ic_facebook)

            builder.setPositiveButton("YES"){dialogInterface, which->
                Toast.makeText(applicationContext,"clicked yes",Toast.LENGTH_LONG).show()

            }

            builder.setNegativeButton("NO"){dialogInterface, which->
                Toast.makeText(applicationContext,"clicked NO",Toast.LENGTH_LONG).show()

            }

            builder.setNeutralButton("Cancel"){dialogInterface, which->
                Toast.makeText(applicationContext,"clicked Cancel",Toast.LENGTH_LONG).show()

            }



            val alertDialog:AlertDialog=builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()







        }
*/


//Custome
        btnSubmit.setOnClickListener {

            val dialog = Dialog(this)
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setCancelable(false)
            dialog.setContentView(R.layout.custome_dialog)
            val body = dialog.findViewById(R.id.tvBody) as TextView
            body.text = title
            val yesBtn = dialog.findViewById(R.id.btn_yes) as Button
            val noBtn = dialog.findViewById(R.id.btn_no) as TextView
            yesBtn.setOnClickListener {
                dialog.dismiss()
            }
            noBtn.setOnClickListener {
                dialog.dismiss()
            }
            dialog.show()


        }





    }
}
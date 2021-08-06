package com.example.deisgnapp.callingapi

import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

import com.example.deisgnapp.R

class CallingActivity : AppCompatActivity() {
    lateinit var edtMobileNumber:EditText
    private val requestCall=1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calling)

        intiView()

    }

    private fun intiView() {

        val btnCalling=findViewById<Button>(R.id.btnCalling)
         edtMobileNumber=findViewById<EditText>(R.id.edtMobileNumber)


        btnCalling.setOnClickListener {
            calling()
        }
    }

    private fun calling() {
        val number=edtMobileNumber.text.toString().trim()
        if (number.isNotEmpty()){
            if(ContextCompat.checkSelfPermission(this,Manifest.permission.CALL_PHONE)!=PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CALL_PHONE),requestCall)

            }else{
                val dial="tel:$number"
                startActivity(Intent(Intent.ACTION_CALL, Uri.parse(dial)))
            }

        }else{
            Toast.makeText(this, "Enter Phone Number", Toast.LENGTH_SHORT).show()

        }

    }

    @SuppressLint("MissingSuperCall")
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
       if (requestCode==requestCall){
           if (grantResults.isNotEmpty() && grantResults[0]==PackageManager.PERMISSION_GRANTED){
               calling()
           }else{
               Toast.makeText(this, "Permission DENIED", Toast.LENGTH_SHORT).show()
           }
       }
    }
}
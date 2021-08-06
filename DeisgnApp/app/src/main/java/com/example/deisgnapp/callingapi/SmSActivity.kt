package com.example.deisgnapp.callingapi

import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.deisgnapp.R

class SmSActivity : AppCompatActivity() {
    lateinit var edtMobileNumber: EditText
    lateinit var edtMsg: EditText

    private val permissionRequest=1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sm_sactivity)
        intiView()

    }
    private fun intiView() {

        val btnCalling=findViewById<Button>(R.id.btnCalling)
        edtMobileNumber=findViewById<EditText>(R.id.edtMobileNumber)
        edtMsg=findViewById<EditText>(R.id.edtMsg)



        btnCalling.setOnClickListener {
            sendSms()
        }
    }

    private fun sendSms() {
        val permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS)
        if (permissionCheck== PackageManager.PERMISSION_GRANTED){
            callMassage()

        }else{
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.SEND_SMS), permissionRequest)
        }


    }

    private fun callMassage() {
        val number=edtMobileNumber.text.toString().trim()
        val edtMsg=edtMsg.text.toString().trim()

        if (number.isEmpty() && edtMsg.isEmpty()){
            Toast.makeText(this,"Field cannot be empty",Toast.LENGTH_LONG).show()
        }else{
            if (TextUtils.isDigitsOnly(number)){
                val smsManager: SmsManager= SmsManager.getDefault()
                smsManager.sendTextMessage(number,null,edtMsg,null,null)
                Toast.makeText(this, "Message Sent", Toast.LENGTH_SHORT).show()


            }else{
                Toast.makeText(this, "Please enter the correct number", Toast.LENGTH_SHORT).show()

            }

        }

    }

    @SuppressLint("MissingSuperCall")
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        if (requestCode==permissionRequest){
            if (grantResults.isNotEmpty() && grantResults[0]== PackageManager.PERMISSION_GRANTED){
                callMassage()
            }else{
                Toast.makeText(this, "Permission DENIED", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

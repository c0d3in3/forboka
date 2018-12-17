package com.example.bokak.randomapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    var firebaseAuth:FirebaseAuth = FirebaseAuth.getInstance()
    var email = textEmailAddress.text.toString()
    var password = textPassword.text.toString()
    var repeatpassword = textPasswordRepeat.text.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        if (password == repeatpassword){
            val activitychanger : Button = findViewById(R.id.RegisterButton)
            activitychanger.setOnClickListener {
                val intent = Intent(this, LoginActivity :: class.java)
                startActivity(intent)}
        }else{
            Log.d("wrongrepeat","incorrectly repeated")
        }
    }
}

package com.example.bokak.randomapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val activitychanger2 : Button = findViewById(R.id.LoginButton)
        activitychanger2.setOnClickListener {
            val intent = Intent(this, ImageActivity :: class.java)
            startActivity(intent)
        }



    }
}

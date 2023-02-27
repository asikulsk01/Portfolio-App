package com.example.scrollview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGithub= findViewById<ImageView>(R.id.imgGithub)


        btnGithub.setOnClickListener{
            intent= Intent(applicationContext,webViewGithub::class.java)
            startActivity(intent)
        }

    }
}
package com.example.viruj

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class brief3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_brief3)
        val nextButton : Button= findViewById(R.id.buttonbrief3)
        nextButton.setOnClickListener {
            val intent = Intent(this , SignUp::class.java)
            startActivity(intent)
        }
    }
}
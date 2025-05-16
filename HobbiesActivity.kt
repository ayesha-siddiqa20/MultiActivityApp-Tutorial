package com.example.myportfolio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HobbiesActivity : AppCompatActivity() {
    lateinit var titleUsername1 : TextView
    lateinit var nextButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_hobbies)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        titleUsername1 = findViewById(R.id.titleUsername)
        nextButton = findViewById(R.id.button3)
        val name = intent.getStringExtra("userName")

        titleUsername1.text = "Hi ${name ?: "User"}! Here are my favorite hobbies 🎨"
        nextButton.setOnClickListener {
            SoundPlayer.playPop(this)
            val contactIntent = Intent(this, ContactActivity::class.java)
            contactIntent.putExtra("userName2", name)
            startActivity(contactIntent)

        }
    }
}
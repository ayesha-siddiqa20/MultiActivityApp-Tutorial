package com.example.myportfolio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ContactActivity : AppCompatActivity() {
    lateinit var displayName : TextView
    lateinit var button2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_contact)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        displayName = findViewById(R.id.displayName)
        button2 = findViewById(R.id.button2)
        val userName2 = intent.getStringExtra("userName2")
        displayName.text = "Thanks for visiting, ${userName2 ?: "User"}!"
        button2.setOnClickListener {
            SoundPlayer.playPop(this)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Optional: removes ContactActivity from the back stack
        }


    }
}
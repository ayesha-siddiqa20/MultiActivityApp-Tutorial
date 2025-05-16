package com.example.myportfolio

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var button2: Button
    lateinit var textInput2 : EditText

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        button2 = findViewById(R.id.button)
        textInput2 = findViewById(R.id.textInput)

        button2.setOnClickListener {
            val name = textInput2.text.toString().trim()
            val intent = Intent(this, HobbiesActivity::class.java)
            SoundPlayer.playPop(this)

            intent.putExtra("userName", name)
            startActivity(intent)

        }
    }


}
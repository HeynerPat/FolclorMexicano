package com.example.folclormexicano

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Campeche : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_campeche)
        val b1 = findViewById<Button>(R.id.b1)
        val b2 = findViewById<Button>(R.id.b2)
        val b3 = findViewById<Button>(R.id.b3)
        val b4 = findViewById<Button>(R.id.b4)
        val b5 = findViewById<Button>(R.id.b5)
        val b6 = findViewById<Button>(R.id.b6)

        b1.setOnClickListener {
            val intent = Intent(this, baileCamp1::class.java)
            startActivity(intent)
        }
        b2.setOnClickListener {
            val intent = Intent(this,baileCamp2::class.java)
            startActivity(intent)
        }
        b3.setOnClickListener {
            val intent = Intent(this,baileCamp3::class.java)
            startActivity(intent)
        }
        b4.setOnClickListener {
            val intent = Intent(this,baileCamp4::class.java)
            startActivity(intent)
        }
        b5.setOnClickListener {
            val intent = Intent(this,baileCamp5::class.java)
            startActivity(intent)
        }
        b6.setOnClickListener {
            val intent = Intent(this,baileCamp6::class.java)
            startActivity(intent)
        }
    }
}
package com.example.folclormexicano

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Yucatan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yucatan)

        val b1 = findViewById<Button>(R.id.b1)
        val b2 = findViewById<Button>(R.id.b2)
        val b3 = findViewById<Button>(R.id.b3)
        val b4 = findViewById<Button>(R.id.b4)
        val b5 = findViewById<Button>(R.id.b5)
        val b6 = findViewById<Button>(R.id.b6)

        b1.setOnClickListener {
            val intent = Intent(this,baileYuc1::class.java)
            startActivity(intent)
        }
        b2.setOnClickListener {
            val intent = Intent(this,baileYuc2::class.java)
            startActivity(intent)
        }
        b3.setOnClickListener {
            val intent = Intent(this,baileYuc3::class.java)
            startActivity(intent)
        }
        b4.setOnClickListener {
            val intent = Intent(this,baileYuc4::class.java)
            startActivity(intent)
        }
        b5.setOnClickListener {
            val intent = Intent(this,baileYuc5::class.java)
            startActivity(intent)
        }
        b6.setOnClickListener {
            val intent = Intent(this,baileYuc6::class.java)
            startActivity(intent)
        }
    }
}
package com.example.folclormexicano

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class seleccionEstados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seleccion_estados)

        val bQr = findViewById<Button>(R.id.bQR)
        val bYuc = findViewById<Button>(R.id.bYuc)
        val bCamp = findViewById<Button>(R.id.bCamp)
        val bJalis = findViewById<Button>(R.id.bJalis)
        val bQuere = findViewById<Button>(R.id.bQuere)
        val bSina = findViewById<Button>(R.id.bSina)

        bQr.setOnClickListener {
            val intent = Intent(this,QuintanaRoo::class.java)
            startActivity(intent)
        }
        bYuc.setOnClickListener {
            val intent = Intent(this,Yucatan::class.java)
            startActivity(intent)
        }
        bCamp.setOnClickListener {
            val intent = Intent(this,Campeche::class.java)
            startActivity(intent)
        }
        bJalis.setOnClickListener {
            val intent = Intent(this,Jalisco::class.java)
            startActivity(intent)
        }
        bQuere.setOnClickListener {
            val intent = Intent(this,Queretaro::class.java)
            startActivity(intent)
        }
        bSina.setOnClickListener {
            val intent = Intent(this,Sinaloa::class.java)
            startActivity(intent)
        }


    }
}
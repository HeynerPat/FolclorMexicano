package com.example.folclormexicano

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val etNombre = findViewById<EditText>(R.id.etUsuario)

        val etContraseña = findViewById<EditText>(R.id.etContraseña)

        val bIngresar = findViewById<Button>(R.id.bIngresar)

        bIngresar.setOnClickListener{
            val nUsuario = etNombre.getText().toString()
            val pass:String = etContraseña.getText().toString()
            if(nUsuario.equals("Heyner") && pass.equals("Heynerk31")){
                var intent = Intent(this,seleccionEstados::class.java)
                startActivity(intent)
                Toast.makeText(this,"Bienvenido!",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"Usuario o Contraseña incorrectos",Toast.LENGTH_SHORT).show()
            }
        }


    }
}
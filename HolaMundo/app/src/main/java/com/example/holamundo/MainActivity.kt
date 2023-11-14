package com.example.holamundo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hola)

        val btnSuma=findViewById<Button>(R.id.btnSuma)
        val Numero1=findViewById<EditText>(R.id.txtNum1)
        val Numero2=findViewById<EditText>(R.id.txtNum2)

        var Act2=findViewById<Button>(R.id.btnA2)
        var Act3=findViewById<Button>(R.id.btnA3)
        var Act4=findViewById<Button>(R.id.btnA4)
        var Act5=findViewById<Button>(R.id.btnA5)

        btnSuma.setOnClickListener {
            val Resu=findViewById<TextView>(R.id.Res)
            val num1 = Numero1.text.toString().toInt()
            val num2 = Numero2.text.toString().toInt()
            val suma = num1 + num2
            Resu.text = "Resultado: ${suma.toString()}"
        }

        Act2.setOnClickListener{
            val intent = Intent(this, RadioButton::class.java)
            startActivity(intent)
        }

        Act3.setOnClickListener{
            val act2 = Intent(this, ListView::class.java)
            startActivity(act2)
        }

        Act4.setOnClickListener{
            val act2 = Intent(this, ImageButton::class.java)
            startActivity(act2)
        }

        Act5.setOnClickListener{
            val act2 = Intent(this, Examen::class.java)
            startActivity(act2)
        }

    }

}
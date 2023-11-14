package com.example.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.ComponentActivity

class RadioButton : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)

        val R1=findViewById<RadioButton>(R.id.r1)
        val R2=findViewById<RadioButton>(R.id.r2)

        val Numero1=findViewById<EditText>(R.id.txtNum1)
        val Numero2=findViewById<EditText>(R.id.txtNum2)

        val btnOpera=findViewById<Button>(R.id.btnO)

        btnOpera.setOnClickListener {
            val Resu=findViewById<TextView>(R.id.Res)
            val num1 = Numero1.text.toString().toInt()
            val num2 = Numero2.text.toString().toInt()

            if (R1.isChecked)
                Resu.text = "Resultado: ${num1 + num2}"
            if (R2.isChecked)
                Resu.text = "Resultado: ${num1 - num2}"

        }


    }
}
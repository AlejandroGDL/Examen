package com.example.holamundo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.ComponentActivity
import android.widget.ListView




class Examen : ComponentActivity() {

    private val Historial = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_examen)

        //Importar Text Number
        val txt1=findViewById<EditText>(R.id.txte1)
        val txt2=findViewById<EditText>(R.id.txte2)
        val txt3=findViewById<EditText>(R.id.txte3)

        //Importar Boton para Resultado
        val botonR=findViewById<Button>(R.id.btnRese)

        //Importar Radio Buttons
        val R1=findViewById<RadioButton>(R.id.Re1)
        val R2=findViewById<RadioButton>(R.id.Re2)
        val R3=findViewById<RadioButton>(R.id.Re3)
        val R4=findViewById<RadioButton>(R.id.Re4)

        //Importar Text View para Resultado
        val Resue=findViewById<TextView>(R.id.txtRese)

        //Importar ListView para el Historial
        val Lista=findViewById<TextView>(R.id.txtHistorial)

        botonR.setOnClickListener {
            val num1 = txt1.text.toString().toInt()
            val num2 = txt2.text.toString().toInt()
            val num3 = txt3.text.toString().toInt()

            if(R1.isChecked){
                val Res = num1+num2+num3;
                Resue.text = "Resultado: $Res"

                //Convertir a String e Imprimir
                val Resultado = Res.toString()
                Historial.add(Resultado)
                val Hola = Historial.toString()
                Lista.text = (Hola)

                //Limpiar Text Number
                txt1.text.clear();
                txt2.text.clear();
                txt3.text.clear();

            }
            if(R2.isChecked){
                val Res = num1-num2-num3;
                Resue.text = "Resultado: $Res"

                //Convertir a String e Imprimir
                val Resultado = Res.toString()
                Historial.add(Resultado)
                val Hola = Historial.toString()
                Lista.text = (Hola)

                //Limpiar Text Number
                txt1.text.clear();
                txt2.text.clear();
                txt3.text.clear();
            }
            if(R3.isChecked){
                val Res = num1*num2*num3;
                Resue.text = "Resultado: $Res"

                //Convertir a String e Imprimir
                val Resultado = Res.toString()
                Historial.add(Resultado)
                val Hola = Historial.toString()
                Lista.text = (Hola)

                //Limpiar Text Number
                txt1.text.clear();
                txt2.text.clear();
                txt3.text.clear();
            }
            if(R4.isChecked){
                val Res = num1/num2/num3;
                Resue.text = "Resultado: $Res"

                //Convertir a String e Imprimir
                val Resultado = Res.toString()
                Historial.add(Resultado)
                val Hola = Historial.toString()
                Lista.text = (Hola)

                //Limpiar Text Number
                txt1.text.clear();
                txt2.text.clear();
                txt3.text.clear();
            }

        }


    }
}
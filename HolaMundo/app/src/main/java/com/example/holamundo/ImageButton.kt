package com.example.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class ImageButton : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_button)

        val tv1=findViewById<TextView>(R.id.txtRes)
        val btnImg=findViewById<ImageButton>(R.id.btnImg)

        btnImg.setOnClickListener {
            tv1.text="Llamando"
        }

    }
}
package com.example.boton_event

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var mainLayout: LinearLayout
    private lateinit var boton: Button
    private var cambiarColor = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainLayout = findViewById(R.id.mainLayout)
        boton = findViewById(R.id.button)

        boton.setOnClickListener {
            // Alterna el color de fondo entre dos colores
            if (cambiarColor) {
                mainLayout.setBackgroundColor(Color.WHITE)
            } else {
                mainLayout.setBackgroundColor(Color.parseColor("blue"))
            }
            cambiarColor = !cambiarColor
        }
    }
}

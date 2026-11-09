package com.josejr.accesopredeterminado

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * Pantalla mínima con instrucciones en español para añadir el tile.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

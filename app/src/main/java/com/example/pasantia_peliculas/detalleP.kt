package com.example.pasantia_peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class detalleP : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_p)

        //Pantalla de detalle de pelicula
        val peli = intent.getParcelableExtra<Pelicula>("Peliculas")
        if (peli !=null){
            val img = findViewById<ImageView>(R.id.ImagenP)
            val title = findViewById<TextView>(R.id.titulo)
            val detail = findViewById<TextView>(R.id.detalle)
            val date = findViewById<TextView>(R.id.fecha)

            img.setImageResource(peli.imagen)
            title.text = peli.titulo
            detail.text = peli.detalle
            date.text = peli.fecha
        }
    }
}
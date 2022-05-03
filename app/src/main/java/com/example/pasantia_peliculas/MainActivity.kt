package com.example.pasantia_peliculas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rv: RecyclerView
    private lateinit var lista: ArrayList<Pelicula>
    private lateinit var peliA: peliAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv = findViewById(R.id.PeliculasRV)
        rv.setHasFixedSize(true)
        rv.layoutManager = GridLayoutManager(this, 2)

        lista = ArrayList()
        //Lista de peliculas que se muestra
        lista.add(
            Pelicula(
                R.drawable.nom,
                "No mires arriba",
                "Dos astrónomos mediocres descubren que, en pocos meses, un meteorito destruirá el planeta Tierra. A partir de ese momento, intentan advertir a la humanidad del peligro que se avecina a través de los medios de comunicación.",
                "10 de diciembre de 2021"
            )
        )
        lista.add(
            Pelicula(
                R.drawable.morbius,
                "Morbius",
                "Ambientada en el universo de Spider Man, se centra en uno de sus villanos más icónicos, Morbius, un doctor que tras sufrir una enfermedad en la sangre y fallar al intentar curarse, se convirtió en un vampiro",
                "1 de abril de 2022"
            )
        )
        lista.add(Pelicula(R.drawable.fear,
            "Fear Street",
            "Tras una serie de brutales asesinatos, una adolescente y sus amigos deciden plantarle cara al poder maligno que asola Shadyside, su famosa ciudad, desde hace siglos.",
            "28 de junio de 2021"))

        lista.add(Pelicula(R.drawable.rayo,
            "Cars 3",
            "Eclipsado por los autos jóvenes, el veterano Rayo McQueen ha sido expulsado del deporte que tanto ama. Sin embargo, no se rendirá tan fácilmente, con la ayuda de sus amigos, Rayo aprende trucos nuevos para vencer al arrogante Jackson Storm, el rival que lo humilló.",
            "16 de junio de 2017"))
        lista.add(
            Pelicula(
                R.drawable.jujutsu,
                "Jujutsu Kaisen",
                "Yuka Okkotsu obtiene el control de una maldición extremadamente poderosa y acaba inscrito en el Colegio Técnico de Magia Metropolitana de Tokio, donde otros hechiceros deciden ayudarlo a controlar y vigilar su poder.",
                "24 de diciembre de 2021"
            )
        )
        lista.add(
            Pelicula(
                R.drawable.ven,
                "Venom 2",
                "Después de encontrar un cuerpo anfitrión en el periodista de investigación Eddie Brock, el simbionte alienígena debe enfrentarse a un nuevo enemigo, Carnage, el alter ego del asesino en serie Cletus Kasady.",
                "1 de octubre de 2021"
            )
        )
        lista.add(Pelicula(
            R.drawable.batman,
            "Batman",
            "En su segundo año luchando contra el crimen, Batman explora la corrupción existente en la ciudad de Gotham y el vínculo de esta con su propia familia. Además, entrará en conflicto con un asesino en serie conocido como el Acertijo.",
            "4 de marzo de 2022"))

        lista.add(Pelicula(
            R.drawable.uncharted,
            "Uncharted",
            "El cazador de tesoros Victor Sullivan recluta a Nathan Drake para que lo ayude a recuperar una fortuna de 500 años de antigüedad. Lo que comienza como un atraco se convierte en una competencia contra el despiadado Santiago Moncada.",
            "18 de febrero de 2022"))


        peliA = peliAdapter(lista)
        rv.adapter = peliA

        //funcion click para mostrar la informacion de la pelicula
        peliA.Click = {
            val intent = Intent(this, detalleP::class.java)
            intent.putExtra("Peliculas", it)
            startActivity(intent)

        }
    }
}
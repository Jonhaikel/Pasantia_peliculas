package com.example.pasantia_peliculas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class peliAdapter(private val lista:ArrayList<Pelicula>)
    : RecyclerView.Adapter<peliAdapter.peliHolder>(){

    var Click : ((Pelicula) -> Unit)? = null

    class peliHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val imagen: ImageView = itemView.findViewById(R.id.imagen)
        val titulo: TextView = itemView.findViewById(R.id.pTitulo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): peliHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cartelera,parent,false)
        return peliHolder(view)
    }

    override fun onBindViewHolder(holder: peliHolder, position: Int) {
        val pelis = lista[position]
        holder.imagen.setImageResource(pelis.imagen)
        holder.titulo.text =pelis.titulo


        holder.itemView.setOnClickListener{
            Click?.invoke(pelis)

        }
    }

    override fun getItemCount(): Int {
        return lista.size
    }
}


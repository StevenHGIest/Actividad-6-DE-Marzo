package edu.iest.actividad_6_marzo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.iest.actividad_6_marzo.R
import edu.iest.actividad_6_marzo.adapter.VideogameAdapter
import edu.iest.actividad_6_marzo.models.FackerVideogames

class ListaJuegosActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_juegos)

        val juegos = FackerVideogames().getVideogames()
        // Se pone el recycler view de la vista
        val recycler = findViewById<RecyclerView>(R.id.recyclerJuegos)

        val CANTIDAD_DE_columnas = 2
        val administradorDeLayouts = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL, false)

        recycler.layoutManager = administradorDeLayouts
        recycler.adapter = VideogameAdapter(juegos, this)
    }
}
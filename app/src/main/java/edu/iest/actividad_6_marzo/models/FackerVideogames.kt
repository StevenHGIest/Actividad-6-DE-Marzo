package edu.iest.actividad_6_marzo.models

import edu.iest.actividad_6_marzo.R

class FackerVideogames {

    fun getVideogames(): ArrayList<Videogame>{
        var videogames: ArrayList<Videogame>
        videogames= arrayListOf()

        videogames.add(
            Videogame(1, "Starcraft 2", 700F,
            "PC", R.drawable.sc2))

        videogames.add(
            Videogame(1, "Civilization 6", 500F, "PC",
        R.drawable.civ6))

        videogames.add(
            Videogame(3, "Quake 3", 100F,
        "PC", R.drawable.q3)
        )

        videogames.add(Videogame(4, "Supermario Galaxy", 250F,
        "Wii", R.drawable.supermariogalaxy))

        videogames.add(Videogame(5, "Warcraft 3: Reforged", 450F,
        "PC", R.drawable.w3))

        videogames.add(Videogame(6, "League of Legends", 0F,
        "PC", R.drawable.lol))

        return videogames
    }
}
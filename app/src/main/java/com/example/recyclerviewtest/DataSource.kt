package com.example.recyclerviewtest

import com.example.recyclerviewtest.model.Pokemon

class DataSource {

    companion object {
        fun createDataSet(): ArrayList<Pokemon> {
            val list = ArrayList<Pokemon>()



            list.add(
                Pokemon(
                    "Bulbasaur",
                    "1",
                    "https://img.pokemondb.net/artwork/large/bulbasaur.jpg",
                    "https://pokemondb.net/pokedex/bulbasaur",
                    arrayOf("GRASS", "POISON"),
                )
            )

            list.add(
                Pokemon(
                    "Charmander",
                    "1",
                    "https://img.pokemondb.net/artwork/large/charmander.jpg",
                    "https://pokemondb.net/pokedex/charmander",
                    arrayOf("FIRE"),
                )
            )

            list.add(
                Pokemon(
                    "Squirtle",
                    "1",
                    "https://img.pokemondb.net/artwork/large/squirtle.jpg",
                    "https://pokemondb.net/pokedex/squirtle",
                    arrayOf("WATER"),
                )
            )

            list.add(
                Pokemon(
                    "Caterpie",
                    "1",
                    "https://img.pokemondb.net/artwork/large/caterpie.jpg",
                    "https://pokemondb.net/pokedex/caterpie",
                    arrayOf("BUG"),
                )
            )

            list.add(
                Pokemon(
                    "Jigglypuff",
                    "1",
                    "https://img.pokemondb.net/artwork/large/jigglypuff.jpg",
                    "https://pokemondb.net/pokedex/jigglypuff",
                    arrayOf("NORMAL", "FAIRY"),
                )
            )

            list.add(
                Pokemon(
                    "Meowth",
                    "1",
                    "https://img.pokemondb.net/artwork/large/meowth.jpg",
                    "https://pokemondb.net/pokedex/meowth",
                    arrayOf("NORMAL"),
                )
            )

            list.add(
                Pokemon(
                    "Pidgey",
                    "1",
                    "https://img.pokemondb.net/artwork/large/pidgey.jpg",
                    "https://pokemondb.net/pokedex/pidgey",
                    arrayOf("NORMAL", "FLYING"),
                )
            )

            list.add(
                Pokemon(
                    "Ponyta",
                    "1",
                    "https://img.pokemondb.net/artwork/large/ponyta.jpg",
                    "https://pokemondb.net/pokedex/ponyta",
                    arrayOf("FIRE"),
                )
            )

            list.add(
                Pokemon(
                    "Eevee",
                    "1",
                    "https://img.pokemondb.net/artwork/large/eevee.jpg",
                    "https://pokemondb.net/pokedex/eevee",
                    arrayOf("NORMAL"),
                )
            )

            list.add(
                Pokemon(
                    "Rattata",
                    "1",
                    "https://img.pokemondb.net/artwork/large/rattata.jpg",
                    "https://pokemondb.net/pokedex/rattata",
                    arrayOf("NORMAL"),
                )
            )

            list.add(
                Pokemon(
                    "Snorlax",
                    "1",
                    "https://img.pokemondb.net/artwork/large/snorlax.jpg",
                    "https://pokemondb.net/pokedex/snorlax",
                    arrayOf("NORMAL"),
                )
            )

            list.add(
                Pokemon(
                    "Pikachu",
                    "1",
                    "https://img.pokemondb.net/artwork/large/pikachu.jpg",
                    "https://pokemondb.net/pokedex/pikachu",
                    arrayOf("ELECTRIC"),
                )
            )



            return list
        }
    }
}
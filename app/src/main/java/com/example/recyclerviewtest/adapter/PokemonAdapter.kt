package com.example.recyclerviewtest.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.recyclerviewtest.R
import com.example.recyclerviewtest.model.Pokemon
import kotlinx.android.synthetic.main.list_item_pokemon.view.*

class PokemonAdapter(private val onItemClicked: (Pokemon) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var items: List<Pokemon> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return PokemonViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_item_pokemon, parent, false)
        )

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when (holder) {
            is PokemonViewHolder -> {
                holder.bind(items[position], onItemClicked)
            }
        }

    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setDataSet(pokemons: List<Pokemon>) {
        this.items = pokemons
    }

    class PokemonViewHolder constructor(
        itemView: View,
    ) : RecyclerView.ViewHolder(itemView) {

        private val pokemonImage = itemView.ivImagePokemon
        private val pokemonName = itemView.tvNamePokemon
        private val pokemonTypeONE = itemView.tvTypePokemonONE
        private val pokemonTypeTWO = itemView.tvTypePokemonTWO
        private val pokemonGeneration = itemView.tvGenerationPokemon

        fun bind(pokemon: Pokemon, onItemClicked: (Pokemon) -> Unit) {

            /*var listTypeOfPokemon = arrayOf("${pokemonTypeONE.text}", "${pokemonTypeTWO.text}")
            listTypeOfPokemon = pokemon.listType*/

            /*when(pokemon.listType) {
                is "GRASS" -> {
                pokemonTypeONE.isVisible = false
                }
            }*/

            if (pokemon.listType.count() < 2) {
                pokemonTypeONE.text = pokemon.listType[0]
                pokemonTypeTWO.isVisible = false
            } else {
                pokemonTypeONE.text = pokemon.listType[0]
                pokemonTypeTWO.text = pokemon.listType[1]
            }


            pokemonName.text = pokemon.name
            pokemonGeneration.text = pokemon.generation

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(pokemon.thumbnailUrl)
                .into(pokemonImage)


            itemView.setOnClickListener{
                onItemClicked(pokemon)
            }
        }
    }
}
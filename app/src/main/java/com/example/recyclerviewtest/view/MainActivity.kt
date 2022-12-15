package com.example.recyclerviewtest.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewtest.DataSource
import com.example.recyclerviewtest.R
import com.example.recyclerviewtest.adapter.PokemonAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var pokemonAdapter : PokemonAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        addDataSource()
    }

    private fun addDataSource() {
        val dataSource = DataSource.createDataSet()
        this.pokemonAdapter.setDataSet(dataSource)
    }

    private fun initRecyclerView() {
        this.pokemonAdapter = PokemonAdapter()

        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
        recyclerView.adapter = this.pokemonAdapter

    }
}
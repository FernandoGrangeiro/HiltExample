package com.example.pokelist.presentation

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.pokelist.data.response.PokeListItemResponse
import com.example.pokelist.databinding.ActivityPokeListBinding
import com.example.pokelist.presentation.adapter.PokeListAdapter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class PokeListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPokeListBinding
    private val pokeListViewModel: PokeListViewModel by viewModels()

    @Inject
    lateinit var pokeListAdapter: PokeListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPokeListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        pokeListViewModel.getPokeList()
        arroz()
    }

    private fun arroz() {
        pokeListViewModel.pokelist.observe(this, Observer {
            setAdapter(it.results)
        })
    }

    private fun setAdapter(items: List<PokeListItemResponse>) {
        pokeListAdapter.setData(items)
        binding.recycler.adapter = pokeListAdapter
    }
}
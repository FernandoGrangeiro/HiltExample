package com.example.pokelist.presentation

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.pokelist.databinding.ActivityPokeListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PokeListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPokeListBinding
    private val pokeListViewModel by viewModels<PokeListViewModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPokeListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        pokeListViewModel.getPokeList()
    }

    private fun setAdapter() {
    }
}
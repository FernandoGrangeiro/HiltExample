package com.example.pokelist.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokelist.data.response.PokeListItemResponse
import com.example.pokelist.databinding.PokemonItemBinding

class PokeListAdapter(var items: List<PokeListItemResponse>) :
    RecyclerView.Adapter<PokeListAdapter.PokemonListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonListViewHolder {
        val binding = PokemonItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return PokemonListViewHolder(binding)
    }

    fun setData(items: List<PokeListItemResponse>) {
        this.items = items
        notifyDataSetChanged()
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: PokemonListViewHolder, position: Int) {
        with(holder) {
            binding.pokemonName.text = items[position].name
            binding.base.setOnClickListener {}
        }
    }

    inner class PokemonListViewHolder(val binding: PokemonItemBinding) :
        RecyclerView.ViewHolder(binding.root)
}
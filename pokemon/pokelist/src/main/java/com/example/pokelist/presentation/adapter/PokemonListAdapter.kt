package com.example.pokelist.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokelist.data.response.PokeListResponse
import com.example.pokelist.databinding.PokemonItemBinding

class PokemonListAdapter(val items: List<PokeListResponse>) :
    RecyclerView.Adapter<PokemonListAdapter.PokemonListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonListViewHolder {
        val binding = PokemonItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return PokemonListViewHolder(binding)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: PokemonListViewHolder, position: Int) {
        with(holder) {
//            Glid.with(itemView.context)
//                .load(badgeUrl)
//                .into(binding.topLearnerImage)

            itemView.setOnClickListener {}
        }
    }

    inner class PokemonListViewHolder(val binding: PokemonItemBinding) :
        RecyclerView.ViewHolder(binding.root)

}
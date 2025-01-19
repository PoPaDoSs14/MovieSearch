package com.example.moviesearch.presentation

import androidx.recyclerview.widget.DiffUtil
import com.example.moviesearch.domain.Search

class MovieDiffCallback : DiffUtil.ItemCallback<Search>() {
    override fun areItemsTheSame(oldItem: Search, newItem: Search): Boolean {
        return oldItem.imdbID == newItem.imdbID
    }

    override fun areContentsTheSame(oldItem: Search, newItem: Search): Boolean {
        return oldItem == newItem
    }
}
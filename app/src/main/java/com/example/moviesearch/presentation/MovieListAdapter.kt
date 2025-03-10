package com.example.moviesearch.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.moviesearch.databinding.MovieItemBinding
import com.example.moviesearch.domain.Doc

class MovieListAdapter(private val listener: OnItemClickListener) : ListAdapter<Doc, MovieViewHolder>(MovieDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val binding = MovieItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = getItem(position)
        holder.bind(movie, listener)
    }

    interface OnItemClickListener {
        fun onItemClick(movie: Doc)
    }
}
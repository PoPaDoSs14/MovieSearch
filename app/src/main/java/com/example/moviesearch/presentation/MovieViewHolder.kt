package com.example.moviesearch.presentation

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.moviesearch.databinding.MovieItemBinding
import com.example.moviesearch.domain.Doc

class MovieViewHolder(private val binding: MovieItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(movie: Doc, listener: MovieListAdapter.OnItemClickListener) {
        binding.titleTextView.text = movie.name
        binding.releaseDateTextView.text = movie.poster.url

        Glide.with(binding.posterImageView.context)
            .load(movie.poster.url)
            .apply(RequestOptions().transform(RoundedCorners(16)))
            .into(binding.posterImageView)

        itemView.setOnClickListener {
            listener.onItemClick(movie)
        }
    }
}
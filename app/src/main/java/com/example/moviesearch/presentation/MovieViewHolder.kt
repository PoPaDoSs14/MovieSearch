package com.example.moviesearch.presentation

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.moviesearch.databinding.MovieItemBinding
import com.example.moviesearch.domain.Movie
import com.example.moviesearch.domain.Search

class MovieViewHolder(private val binding: MovieItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(search: Search) {
        binding.titleTextView.text = search.Title
        binding.releaseDateTextView.text = search.Poster


        Glide.with(binding.posterImageView.context)
            .load(search.Poster)
            .apply(RequestOptions().transform(RoundedCorners(16)))
            .into(binding.posterImageView)
    }
}
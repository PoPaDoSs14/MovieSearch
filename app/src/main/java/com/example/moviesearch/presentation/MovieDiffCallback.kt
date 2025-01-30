package com.example.moviesearch.presentation

import androidx.recyclerview.widget.DiffUtil
import com.example.moviesearch.domain.Doc


class MovieDiffCallback : DiffUtil.ItemCallback<Doc>() {
    override fun areItemsTheSame(oldItem: Doc, newItem: Doc): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Doc, newItem: Doc): Boolean {
        return oldItem == newItem
    }
}
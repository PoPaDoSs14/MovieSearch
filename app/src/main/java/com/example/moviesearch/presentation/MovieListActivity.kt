package com.example.moviesearch.presentation

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviesearch.App
import com.example.moviesearch.R
import com.example.moviesearch.databinding.ActivityMovieListBinding
import javax.inject.Inject

class MovieListActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: MovieListViewModel
    private lateinit var adapter: MovieListAdapter

    private val component by lazy {
        (application as App).component
    }
    private lateinit var binding: ActivityMovieListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        component.inject(this)
        initializeBinding()
        viewModel.test()
    }

    private fun initializeBinding() {
        binding = ActivityMovieListBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setupRecyclerView() {
        adapter = MovieListAdapter()
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
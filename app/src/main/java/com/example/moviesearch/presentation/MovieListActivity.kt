package com.example.moviesearch.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviesearch.App
import com.example.moviesearch.R
import com.example.moviesearch.databinding.ActivityMovieListBinding
import com.example.moviesearch.domain.Movie
import javax.inject.Inject

class MovieListActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: MovieListViewModel

    private lateinit var adapter: MovieListAdapter
    private lateinit var binding: ActivityMovieListBinding

    private val component by lazy {
        (application as App).component
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        component.inject(this)

        initializeBinding()
        setupRecyclerView()

        val movieName = getMovieName() ?: ""
        viewModel.getMovies(movieName)
        observeViewModel()
    }

    private fun getMovieName(): String? {
        return intent.getStringExtra("EXTRA_MOVIE_NAME")?.also {
            Log.d("MovieListActivity", "Selected movie: $it")
        }
    }

    private fun initializeBinding() {
        binding = ActivityMovieListBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setupRecyclerView() {
        adapter = MovieListAdapter()
        binding.recyclerView.apply {
            adapter = this@MovieListActivity.adapter
            layoutManager = LinearLayoutManager(context)
        }
    }

    private fun observeViewModel() {
        viewModel.movie.observe(this) { movie ->
            adapter.submitList(movie.docs)
        }
    }
}
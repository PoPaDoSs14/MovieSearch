package com.example.moviesearch.presentation

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.moviesearch.App
import com.example.moviesearch.databinding.ActivityMainBinding
import javax.inject.Inject

class FindMovieActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: FindMovieViewModel

    private val component by lazy {
        (application as App).component
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        component.inject(this)
        initializeBinding()

        viewModel.test()


        binding.button.setOnClickListener {
            navigateToMovieList()
        }
    }

    private fun initializeBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun navigateToMovieList() {
        val selectedMovie = binding.editTextText.text.toString().trim()

        if (selectedMovie.isNotEmpty()) {
            val intent = Intent(this, MovieListActivity::class.java).apply {
                putExtra("EXTRA_MOVIE_NAME", selectedMovie)
            }
            startActivity(intent)
        } else {
            Toast.makeText(this, "Введите название фильма", Toast.LENGTH_SHORT).show()
        }
    }
}
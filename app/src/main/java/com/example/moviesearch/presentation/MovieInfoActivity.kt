package com.example.moviesearch.presentation

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.moviesearch.R
import com.example.moviesearch.databinding.ActivityMovieInfoBinding
import javax.inject.Inject

class MovieInfoActivity : AppCompatActivity() {

    @Inject()
    private lateinit var viewModel: MovieInfoViewModel

    private lateinit var binding: ActivityMovieInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}
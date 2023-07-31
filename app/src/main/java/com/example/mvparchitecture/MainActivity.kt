package com.example.mvparchitecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvparchitecture.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), BaseView {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)


        setContentView(binding.root)
    }

    override fun showExecise(execise: Exercise) {

    }
}
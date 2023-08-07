package com.example.mvparchitecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvparchitecture.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), BaseView {

    private lateinit var binding: ActivityMainBinding
    private val presenter = App.instance.mainActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)


        setContentView(binding.root)
        presenter.attach(this)
        binding.buttonDataExercise.setOnClickListener{
            presenter.getExercise()
        }
    }

    override fun showExecise(execise: Exercise) {
            binding.nameExercise.text = execise.name
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        presenter.detach()
        super.onDestroy()
    }
}
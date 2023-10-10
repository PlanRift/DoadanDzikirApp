package com.example.doadandzikirapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.doadandzikirapp.R
import com.example.doadandzikirapp.adapter.DzikirDoaAdapter
import com.example.doadandzikirapp.databinding.ActivityDzikirdanDoaHarianBinding
import com.example.doadandzikirapp.model.DataDzikirDoaModel

class DzikirdanDoaHarianActivity : AppCompatActivity() {

    lateinit var binding: ActivityDzikirdanDoaHarianBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirdanDoaHarianBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Dzikir - Doa Harian"


    }
}
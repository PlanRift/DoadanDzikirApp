package com.example.doadandzikirapp.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.doadandzikirapp.R
import com.example.doadandzikirapp.adapter.DzikirDoaAdapter
import com.example.doadandzikirapp.databinding.ActivityDzikirPetangBinding
import com.example.doadandzikirapp.model.DataDzikirDoaModel

class DzikirPetangActivity : AppCompatActivity() {

    lateinit var binding: ActivityDzikirPetangBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirPetangBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Dzikir - Dzikir Petang"

        binding.apply {
            rvDzikirPetang.layoutManager = LinearLayoutManager(this@DzikirPetangActivity)
            rvDzikirPetang.adapter = DzikirDoaAdapter(DataDzikirDoaModel.listDzikirPetang)
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}
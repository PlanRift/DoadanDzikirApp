package com.example.doadandzikirapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.doadandzikirapp.R
import com.example.doadandzikirapp.adapter.DzikirDoaAdapter
import com.example.doadandzikirapp.databinding.ActivityDzikirdanDoaHarianBinding
import com.example.doadandzikirapp.model.DzikirDoaModel

class DzikirdanDoaHarianActivity : AppCompatActivity() {
    lateinit var binding: ActivityDzikirdanDoaHarianBinding
    private val listDoaHarian: ArrayList<DzikirDoaModel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirdanDoaHarianBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setDataDoa()

        // action bar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Dzikir dan Doa Harian"




        binding.apply {
            rvDzikirDoaHarian.layoutManager = LinearLayoutManager(this@DzikirdanDoaHarianActivity)
            rvDzikirDoaHarian.adapter = DzikirDoaAdapter(listDoaHarian)
        }

    }

    private fun setDataDoa() {
        val desc = resources.getStringArray(R.array.arr_dzikir_doa_harian)
        val lafaz = resources.getStringArray(R.array.arr_lafaz_dzikir_doa_harian)
        val terjemah = resources.getStringArray(R.array.arr_terjemah_dzikir_doa_harian)


        val minLength = minOf(desc.size, lafaz.size, terjemah.size)

        for (data in 0 until minLength) {
            val doa = DzikirDoaModel(
                desc[data],
                lafaz[data],
                terjemah[data]
            )
            listDoaHarian.add(doa)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}
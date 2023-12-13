package com.example.sportskitim10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sportskitim10.databinding.ActivityDodajTimBinding
import com.example.sportskitim10.databinding.ActivityIgracUtimuBinding

class IgracUTimu : AppCompatActivity() {
    lateinit var binding: ActivityIgracUtimuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_igrac_utimu)

        binding.btnNatrag.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
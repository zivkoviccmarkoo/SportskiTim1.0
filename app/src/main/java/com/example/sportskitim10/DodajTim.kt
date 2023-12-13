package com.example.sportskitim10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sportskitim10.databinding.ActivityDodajIgracaBinding
import com.example.sportskitim10.databinding.ActivityDodajTimBinding

class DodajTim : AppCompatActivity() {
    lateinit var binding: ActivityDodajTimBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dodaj_tim)

        binding.btnNatrag.setOnClickListener {
            val intent = Intent(this, Tim::class.java)
            startActivity(intent)
        }
    }
}
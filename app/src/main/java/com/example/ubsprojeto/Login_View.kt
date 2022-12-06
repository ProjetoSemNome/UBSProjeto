package com.example.ubsprojeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ubsprojeto.databinding.ActivityLoginViewBinding

class Login_View : AppCompatActivity() {

    private lateinit var binding: ActivityLoginViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btEntrar.setOnClickListener{
            val intent = Intent(this, Home_View::class.java)
            startActivity(intent)
        }

        supportActionBar?.hide()

    }
}
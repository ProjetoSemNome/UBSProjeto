package com.example.ubsprojeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ubsprojeto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btEntrar.setOnClickListener {
            val intent = Intent(this, Login_View::class.java)
            startActivity(intent)
        }

        binding.btCadastrar.setOnClickListener {
            val intent = Intent(this, Register_View::class.java)
            startActivity(intent)
        }

        supportActionBar?.hide()
    }


}
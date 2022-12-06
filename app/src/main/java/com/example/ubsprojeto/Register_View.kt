package com.example.ubsprojeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ubsprojeto.databinding.ActivityRegisterViewBinding

class Register_View : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btCadastrar.setOnClickListener {
            val intent = Intent(this, Login_View::class.java)
            startActivity(intent)
        }

        binding.txCadastrar.setOnClickListener{
            val intent = Intent(this, Login_View::class.java)
            startActivity(intent)
        }

        supportActionBar?.hide()


    }
}
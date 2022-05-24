package com.androidbootcamp.mysplashscreen1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androidbootcamp.mysplashscreen1.databinding.ActivityRegistroBinding

const val EXTRA_MESSAGE1 = "com.androidbootcamp.mysplashscreen1.MESSAGE1"


class RegistroActivity : AppCompatActivity() {
    lateinit var binding: ActivityRegistroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.buttonBack.setOnClickListener{
            callMainActivity()
        }
    }

    fun callMainActivity(){
        val intent = Intent(this,MainActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE1,"Ir a la Actividad Principal")
        }
        startActivity(intent)
    }


}
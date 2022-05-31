package com.androidbootcamp.mysplashscreen1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import com.androidbootcamp.mysplashscreen1.databinding.ActivityMainBinding
const val EXTRA_MESSAGE = "com.androidbootcamp.mysplashscreen1.MESSAGE"


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(2000)
        setTheme(R.style.Theme_MySplashScreen1)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.registrarButton.setOnClickListener{
            callRegistroActivity()
        }

        binding.loginButton.setOnClickListener{
            callBuscarActivity()
        }
        binding.invitadoLabel.setOnClickListener{
            callBuscarActivity()
        }
    }

    fun callRegistroActivity(){
        val intent = Intent(this,RegistroActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE,"Ir a la Actividad Registro")
        }
        startActivity(intent)
    }

    fun callBuscarActivity(){
        val intent = Intent(this,BuscarActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE,"Ir a la Actividad Buscar")
        }
        startActivity(intent)
    }


}
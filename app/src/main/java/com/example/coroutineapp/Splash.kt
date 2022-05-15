package com.example.coroutineapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
            supportActionBar?.hide()


        CoroutineScope(Dispatchers.Main).launch {
            delay(1000)
            val intent = Intent(this@Splash,MainActivity::class.java)
            startActivity(intent)


        }
    }
}
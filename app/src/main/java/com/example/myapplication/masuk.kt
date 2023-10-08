package com.example.myapplication

import android.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMasukBinding

class masuk : AppCompatActivity() {

    private lateinit var binding:ActivityMasukBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masuk)

        binding = ActivityMasukBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bfragment.setOnClickListener{replace(fragment1())}

        val message = intent.getStringExtra("EXTRA_MESSAGE")

        val textview = findViewById<TextView>(R.id.text).apply {
            text = message
        }
    }
    private fun replace(fragment: Fragment ){
        val fragmentManager = supportFragmentManager
        val  fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.framentT, fragment)
        fragmentTransaction.commit()
        }
}
package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.Button)

        button.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.Button ->{
                val btn = Intent(this@MainActivity, dbkedua::class.java)
                startActivity(btn)
            }
        }
    }
}
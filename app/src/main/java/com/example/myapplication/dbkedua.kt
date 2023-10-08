package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class dbkedua : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dbkedua)

       val button = findViewById<Button>(R.id.login)

        button.setOnClickListener{
            callActivity()
        }
    }

    private fun callActivity() {
        val name = findViewById<EditText>(R.id.nama)
        val password = findViewById<EditText>(R.id.pass)
        val message = name.text.toString()

        val intent = Intent (this, masuk::class.java).also {
            it.putExtra("EXTRA_MESSAGE",message)
            startActivity(it)
        }
    }
}
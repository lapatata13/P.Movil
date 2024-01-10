package com.example.androidmaster.firstApp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.androidmaster.R

class ResultActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val resultActivity = findViewById<TextView>(R.id.textViewResult)

        val name: String? = intent.extras?.getString("Extra Name").orEmpty()
        resultActivity.text = "Hola $name"
    }
}
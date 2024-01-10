package com.example.androidmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.androidmaster.firstApp.FirstAppActivity
import com.example.androidmaster.imccalculator.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnGreetApp = findViewById<AppCompatButton>(R.id.btnGreet)
        val btnImcCal = findViewById<AppCompatButton>(R.id.btnIMC)

        btnGreetApp.setOnClickListener{
            navigateToGreet()
        }

        btnImcCal.setOnClickListener {
            navigateToImcCalculator()
        }

    }

    private fun navigateToImcCalculator(){
        val intent = Intent(this,ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToGreet(){
        val intent = Intent(this,FirstAppActivity::class.java)
        startActivity(intent)
    }
}
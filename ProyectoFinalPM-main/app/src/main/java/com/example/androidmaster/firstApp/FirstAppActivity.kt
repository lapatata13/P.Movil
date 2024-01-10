package com.example.androidmaster.firstApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.example.androidmaster.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)

        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val etName = findViewById<AppCompatEditText>(R.id.etName)

        //me devolvera el texto dentro del campo



        btnStart.setOnClickListener {
            val user = etName.text.toString()
            if(user.isNotEmpty()){
                Log.i("LuisNava",user )

                val intent =Intent(this,ResultActivity::class.java)
                intent.putExtra("Extra Name",user)
                startActivity(intent)
            }
        }

    }
}
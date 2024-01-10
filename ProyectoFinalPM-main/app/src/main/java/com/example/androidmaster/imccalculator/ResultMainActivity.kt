package com.example.androidmaster.imccalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import com.example.androidmaster.R
import com.example.androidmaster.imccalculator.ImcCalculatorActivity.Companion.IMC_KEY

class ResultMainActivity : AppCompatActivity() {
    private lateinit var tvResult: TextView
    private lateinit var tvIMC: TextView
    private lateinit var tvDescription: TextView
    private lateinit var btnReCalculate: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_main)
        val result:Double = intent.extras?.getDouble(IMC_KEY) ?: -1.0
        initComponent()
        initUI(result)
        initListeners()
    }
    private fun initComponent() {
        tvResult = findViewById(R.id.tvResult)
        tvIMC = findViewById((R.id.tvIMC))
        tvDescription = findViewById(R.id.tvDescription)
        btnReCalculate = findViewById(R.id.btnReCalculate)
    }

    private fun initListeners() {
        btnReCalculate.setOnClickListener {
            onBackPressed()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun initUI(result: Double) {
        tvIMC.text = result.toString()
        when(result){
            in 0.0 .. 18.50 -> {//bajo peso
                tvResult.text = getString(R.string.title_bajo_peso)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.peso_bajo))
                tvDescription.text =  getString(R.string.description_bajo_peso)
            }
            in 18.51 .. 24.99 -> {//peso normal
                tvResult.text = getString(R.string.title_peso_nomal)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.peso_normal))
                tvDescription.text = getString(R.string.description_peso_nomal)
            }
            in 25.00 .. 29.99 -> {//sobrepeso
                tvResult.text = getString(R.string.title_peso_superado)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.peso_sobrepeso))
                tvDescription.text = getString(R.string.description_peso_superado)
            }
            in 30.00.. 99.00 -> {//obesidad
                tvResult.text = getString(R.string.title_peso_obesidad)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.peso_obesidad))
                tvDescription.text = getString(R.string.title_peso_obesidad)
            }
            else -> {
                tvResult.text = getString(R.string.error)
                tvIMC.text = getString(R.string.error)
                tvDescription.text = getString(R.string.error)
            }
        }
    }



}
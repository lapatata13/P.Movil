package com.example.androidmaster.imccalculator

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.example.androidmaster.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import java.text.DecimalFormat

class ImcCalculatorActivity : AppCompatActivity() {

    private var isMaleSelected = true
    private var isFemaleSelected = false
    private var currentWeight: Int = 60
    private var currentAge: Int = 18
    private var currentHeight: Int = 120

    private lateinit var tvHeight: TextView
    private lateinit var viewMale: CardView
    private lateinit var viewFemale: CardView
    private lateinit var tvAge: TextView
    private lateinit var tvWeight: TextView

    private lateinit var rsHeight: RangeSlider

    private lateinit var btnSubtractAge: FloatingActionButton
    private lateinit var btnSumAge: FloatingActionButton
    private lateinit var btnCalculate: AppCompatButton
    private lateinit var btnSubtractWeight: FloatingActionButton
    private lateinit var btnSumWeight: FloatingActionButton

    companion object {
        const val IMC_KEY = "imcResult"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_calculator)
        initComponet()
        initListeners()
        initUi()
    }



    private fun initComponet(){
        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.vieFemale)
        tvHeight = findViewById(R.id.tvHeight)
        rsHeight = findViewById(R.id.rsHeight)
        btnSubtractWeight = findViewById(R.id.btnSubtractWeight)
        btnSumWeight = findViewById(R.id.btnSumWeight)
        tvWeight = findViewById(R.id.tvWeight)
        btnSubtractAge = findViewById(R.id.btnSubtractAge)
        btnSumAge = findViewById(R.id.btnSumAge)
        tvAge = findViewById(R.id.tvAge)
        btnCalculate = findViewById(R.id.btnCalculate)
    }

    @SuppressLint("SetTextI18n")
    private fun initListeners(){
        viewMale.setOnClickListener{
            changeGender()
            setGenderColor()
        }

        viewFemale.setOnClickListener {
            changeGender()
            setGenderColor()
        }

        rsHeight.addOnChangeListener { _, value, _ ->
            val df = DecimalFormat("#.##")
            currentHeight = df.format(value).toInt()
            tvHeight.text = "$currentHeight cm"
        }

        btnSumWeight.setOnClickListener {
            currentWeight += 1
            setWeight()
        }

        btnSubtractWeight.setOnClickListener {
            currentWeight -= 1
            setWeight()
        }

        btnSumAge.setOnClickListener {
            currentAge += 1
            setAge()
        }

        btnSubtractAge.setOnClickListener {
            currentAge -= 1
            setAge()
        }

        btnCalculate.setOnClickListener {
            val result = calculateIMC()
            navigateToResult(result)
        }
    }

    private fun navigateToResult(resultIMC: Double) {
        val intent = Intent(this,ResultMainActivity::class.java)
        intent.putExtra(IMC_KEY,resultIMC)
        startActivity(intent)
    }

    private fun calculateIMC() : Double {
        val df = DecimalFormat("#.##")
        val imc = currentWeight/(currentHeight.toDouble()/100 * currentHeight.toDouble()/100)
        return df.format(imc).toDouble()
    }

    private fun changeGender(){
        isMaleSelected = !isMaleSelected
        isFemaleSelected = !isFemaleSelected
    }

    private fun setGenderColor(){

        viewMale.setBackgroundColor(getBackGroundColor(isMaleSelected))
        viewFemale.setBackgroundColor(getBackGroundColor(isFemaleSelected))
    }

    private fun getBackGroundColor(isSelectedComponent : Boolean): Int {

        //ContextCompat.getColor(this,R.color.background_component_selected)

        val referenceColor = if(isSelectedComponent){
            R.color.background_component_selected
        }else{
            R.color.background_component
        }

        return ContextCompat.getColor(this,referenceColor)
    }

    private fun setWeight(){
        tvWeight.text = currentWeight.toString()
    }

    private fun setAge(){
        tvAge.text = currentAge.toString()
    }

    private fun initUi() {
        setGenderColor()
        setWeight()
        setAge()
    }
}
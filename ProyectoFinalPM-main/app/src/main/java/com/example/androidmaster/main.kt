package com.example.androidmaster

fun main() {
    var numDiv = variableNumerica(5.0,2.0)
    println(numDiv)

    var name:String? = null
    println(name?.get(1) ?: "Es null")
}

fun variableNumerica(firstNumbre: Double, secondNumber: Double): Double{
    return firstNumbre.div(secondNumber)
}
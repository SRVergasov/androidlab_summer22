package com.example.summerpractice22.process

class Calculator {
    fun calculate(name: String, age: Int, height: Int, weight: Double) =
        name.length * age + (height - 100) + (weight * 100).toInt()
}

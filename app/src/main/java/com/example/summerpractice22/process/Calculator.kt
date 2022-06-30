package com.example.summerpractice22.process

class Calculator {
    fun calculate (name: String, age: Int, height: Int, weight: Double): Int {
        var ans = 0
        ans += name.length
        ans *= age
        ans += height - 100
        ans += (weight * 100).toInt()
        return ans

    }
}
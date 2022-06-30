package com.example.summerpractice22.validate

class ValidateChecker {
    private val EPS = 1e-7
    private val MIN_VALUE = 1
    private val MIN_NAME_LEN = 2
    private val MAX_AGE_VALUE = 149
    private val MAX_WEIGHT_VALUE = 249
    private val MAX_HEIGHT_VALUE = MAX_WEIGHT_VALUE

    private fun validName(name: String): Boolean = name.length >= MIN_NAME_LEN
    private fun validAge(age: Int): Boolean =
        age in MIN_VALUE..MAX_AGE_VALUE

    private fun validHeight(height: Int): Boolean =
        height in MIN_VALUE..MAX_HEIGHT_VALUE

    private fun validWeight(weight: Double): Boolean =
        (weight - MIN_VALUE > EPS) && (weight - MAX_WEIGHT_VALUE < EPS)

    fun check(
        name: String,
        age: Int,
        height: Int,
        weight: Double,
    ): Boolean = validName(name) && validAge(age) && validHeight(height) && validWeight(weight)
}

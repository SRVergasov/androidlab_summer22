package com.example.summerpractice22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.summerpractice22.process.Calculator
import com.example.summerpractice22.validate.ValidateChecker

class MainActivity : AppCompatActivity() {

    private var textName: EditText? = null
    private var textAge: EditText? = null
    private var textHeight: EditText? = null
    private var textWeight: EditText? = null
    private var button: Button? = null
    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textName = findViewById(R.id.et_name)
        textAge = findViewById(R.id.et_age)
        textHeight = findViewById(R.id.et_height)
        textWeight = findViewById(R.id.et_weight)
        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)

        button?.setOnClickListener {
            val checker = ValidateChecker()
            val name = textName?.text.toString()
            var age = 0
            var height = 0
            var weight = 0.0
            if (textAge?.text.toString().isNotEmpty() && textHeight?.text.toString().isNotEmpty() &&
                textWeight?.text.toString().isNotEmpty()
            ) {
                age = textAge?.text.toString().toInt()
                height = textHeight?.text.toString().toInt()
                weight = textWeight?.text.toString().toDouble()
            }
            val inputCorrect = checker.check(name, age, height, weight)

            if (inputCorrect) {
                val calc = Calculator()
                val ans = calc.calculate(name, age, height, weight)
                textView?.text = "${getString(R.string.output)}: $ans"
            } else {
                textView?.text = getString(R.string.error_input)
            }

        }
    }
}

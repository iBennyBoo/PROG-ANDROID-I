package com.example.launchiconsanddecisionmaking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.setLogo(R.mipmap.ic_launcher)
        supportActionBar!!.setDisplayUseLogoEnabled(true)

        val convertNumber = findViewById<EditText>(R.id.idConvertNumber)
        val dollarToEuro = findViewById<RadioButton>(R.id.radioButton)
        val euroToDollar = findViewById<RadioButton>(R.id.radioButton2)
        val result = findViewById<TextView>(R.id.idResult)
        val convert = findViewById<Button>(R.id.button)

        convert.setOnClickListener {
            val tenth = DecimalFormat("#.#")
            var dblMeasure = convertNumber.text.toString().toDouble()
            val conversionRate = 0.92
            var convertMeasureNumber: Double?



            if (dollarToEuro.isChecked) {
                if (dblMeasure <= 10000) {
                    convertMeasureNumber = dblMeasure * conversionRate
                    result.text = "€" + tenth.format(convertMeasureNumber)
                } else {
                    Toast.makeText(this@MainActivity, "Dollars must be less than 10,000", Toast.LENGTH_LONG).show()
                }
            }

            if (euroToDollar.isChecked) {
                if (dblMeasure <= 9200) {
                    convertMeasureNumber = dblMeasure / conversionRate
                    result.text = "$" + tenth.format(convertMeasureNumber)
                } else {
                    Toast.makeText(this@MainActivity, "Euros must be less than 9,200", Toast.LENGTH_LONG).show()
                }
            }

        }
    }
}
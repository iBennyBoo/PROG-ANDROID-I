package com.example.parkingapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Spinner
import android.widget.Button
import android.widget.TextView
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    var cost: Double = 0.00
    var totalCharges: Double = 0.00

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hours: EditText = findViewById(R.id.idHours)
        val group: Spinner = findViewById(R.id.spinner)
        val charges: Button = findViewById(R.id.idButton)
        val result: TextView = findViewById(R.id.textView)

        charges.setOnClickListener{
            cost = hours.text.toString().toDouble()
            val currency = DecimalFormat("$###,###.00")
            val tipChoice = group.selectedItem.toString().toDouble()
            totalCharges = cost + (cost * tipChoice)

            val totalChargesFormatted = currency.format(totalCharges)
            result.text = "Cost for food with a tip of $tipChoice is $totalChargesFormatted"

        }

    }
}
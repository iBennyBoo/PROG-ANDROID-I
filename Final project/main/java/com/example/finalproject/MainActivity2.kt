package com.example.finalproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val nounOne = findViewById<EditText>(R.id.editTextOne)
        val nounTwo = findViewById<EditText>(R.id.editTextTwo)
        val adjectiveOne = findViewById<EditText>(R.id.editTextThree)
        val adjectiveTwo = findViewById<EditText>(R.id.editTextFour)
        val verbOne = findViewById<EditText>(R.id.editTextFive)
        val verbTwo = findViewById<EditText>(R.id.editTextSix)
        val adverbOne = findViewById<EditText>(R.id.editTextSeven)

        val button = findViewById<Button>(R.id.button2)

        button.setOnClickListener{
            var first = nounOne.text.toString()
            var second = nounTwo.text.toString()
            var third = adjectiveOne.text.toString()
            var fourth = adjectiveTwo.text.toString()
            var fifth = verbOne.text.toString()
            var sixth = verbTwo.text.toString()
            var seventh = adverbOne.text.toString()

            if(checkEditTexts(first, second, third, fourth, fifth, sixth, seventh) == 1){

            } else{
                var story = "When I woke up this morning, I felt incredibly " + third + ".I got dressed in my " + first + " and headed out the door. As I walked down the street, I noticed a " + fourth + " " + second + " on the sidewalk.\n" +
                        "\n" +
                        "I decided to sit in a nearby park to clear my head. As I sat down on a bench, I noticed a group of people" + fifth + "ing " + seventh + ". It was quite entertaining, so I joined in.\n" +
                        "\n" +
                        "After spending some time at the park, I felt much better. I decided to " + sixth + " back home." + "\n"
                "\n" +
                        "I crashed onto my bed, grateful for the unexpected adventure."

                var intent = Intent(this, MainActivity3::class.java)
                intent.putExtra("Story", story)
                startActivity(intent)
            }
        }
    }

    fun checkEditTexts(one: String, two: String, three: String, four: String, five: String, six: String, seven: String): Int {
        if (one == ""){
            return 1
        }

        if (two == ""){
            return 1
        }

        if (three == ""){
            return 1
        }

        if (four == ""){
            return 1
        }

        if (five == ""){
            return 1
        }

        if (six == ""){
            return 1
        }

        return if (seven == ""){
            return 1
        } else return 0
    }
}
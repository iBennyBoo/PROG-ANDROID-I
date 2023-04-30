package com.example.finalproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {

    enum class Successful
    constructor(val intValue: Int){
        first(1),
        second(2),
        third(3),
        fourth(4),
        fifth(5),
        sixth(6),
        seventh(7),
        success(0)
    }

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


            when(checkEditTexts(first, second, third, fourth, fifth, sixth, seventh)){
                Successful.first -> {
                    Toast.makeText(applicationContext, getString(R.string.errMessage), Toast.LENGTH_LONG).show()
                    nounOne.requestFocus()
                }

                Successful.second -> {
                    Toast.makeText(applicationContext, getString(R.string.errMessage), Toast.LENGTH_LONG).show()
                    nounTwo.requestFocus()
                }

                Successful.third -> {
                    Toast.makeText(applicationContext, getString(R.string.errMessage), Toast.LENGTH_LONG).show()
                    adjectiveOne.requestFocus()
                }

                Successful.fourth -> {
                    Toast.makeText(applicationContext, getString(R.string.errMessage), Toast.LENGTH_LONG).show()
                    adjectiveTwo.requestFocus()
                }

                Successful.fifth -> {
                    Toast.makeText(applicationContext, getString(R.string.errMessage), Toast.LENGTH_LONG).show()
                    verbOne.requestFocus()
                }

                Successful.sixth -> {
                    Toast.makeText(applicationContext, getString(R.string.errMessage), Toast.LENGTH_LONG).show()
                    verbTwo.requestFocus()
                }

                Successful.seventh -> {
                    Toast.makeText(applicationContext, getString(R.string.errMessage), Toast.LENGTH_LONG).show()
                    adverbOne.requestFocus()
                }

                else -> {
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

            /*
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

             */
        }


    }

    fun checkEditTexts(one: String, two: String, three: String, four: String, five: String, six: String, seven: String): Any {
        if (one == ""){
            return Successful.first
        }

        if (two == ""){
            return Successful.second
        }

        if (three == ""){
            return Successful.third
        }

        if (four == ""){
            return Successful.fourth
        }

        if (five == ""){
            return Successful.fifth
        }

        if (six == ""){
            return Successful.sixth
        }

        return if (seven == ""){
            return Successful.seventh
        } else return Successful.success
    }
}
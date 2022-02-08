package com.example.mydicerollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button = findViewById<Button>(R.id.button) //this sets the button on the app to run code
        button.setOnClickListener{
            DieRoll()
        }
    }

    fun DieRoll(){
        val dice = Dice(  6)
        val diceRoll = dice.roll()

        val diceImage: ImageView = findViewById<ImageView>(R.id.imageView)

        if(diceRoll == 1){
            diceImage.setImageResource(R.drawable.dice_1)
        }
        if(diceRoll == 2){
            diceImage.setImageResource(R.drawable.dice_2)
        }
        if(diceRoll == 3){
            diceImage.setImageResource(R.drawable.dice_3)
        }
        if(diceRoll == 4){
            diceImage.setImageResource(R.drawable.dice_4)
        }
        if(diceRoll == 5){
            diceImage.setImageResource(R.drawable.dice_5)
        }
        if(diceRoll == 6){
            diceImage.setImageResource(R.drawable.dice_6)
        }

    }

    class Dice(val numSides:Int){
        fun roll():Int{
            val numberRange:IntRange = 1..numSides
            val randomNumber: Int = numberRange.random()
            return randomNumber
        }
    }

}


package com.example.bitamirshafiee.calculatorappskeletonproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var number : String = ""
    var number2 : Float = 0.0F
    var number3 : Float = 0.0F
    var isAddition : Boolean = false
    var isDevide : Boolean = false
    var isMinus : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun operationFunction(view: View){

        var editText : EditText = findViewById(R.id.txt1)
        Log.d("test", "view nya apa sih ? " + view.id + " - "+ R.id.button_one)
        when(view.id){
            R.id.button_one -> {
                number += "1"
                editText.setText(number)
            }
            R.id.button_two -> {
                number += "2"
                editText.setText(number)
            }
            R.id.button_three -> {
                number += "3"
                editText.setText(number)
            }
            R.id.button_four -> {
                number += "4"
                editText.setText(number)
            }
            R.id.button_five -> {
                number += "5"
                editText.setText(number)
            }
            R.id.button_six -> {
                number += "6"
                editText.setText(number)
            }
            R.id.button_seven -> {
                number += "7"
                editText.setText(number)
            }
            R.id.button_eight -> {
                number += "8"
                editText.setText(number)
            }
            R.id.button_nine -> {
                number += "9"
                editText.setText(number)
            }
            R.id.button_zero -> {
                number += "0"
                editText.setText(number)
            }
            R.id.button_clear -> {
                number = ""
                editText.setText(number)
            }
            R.id.button_sum -> {
                if(number.isNullOrBlank()){
                    editText.setText("")
                }
                else{
                    number2 = number.toFloat()
                    editText?.setText("")
                    isAddition = true
                    number = ""
                }

            }
            R.id.button_divide -> {
                if(number.isNullOrBlank()){
                    editText.setText("")
                }
                else{
                    number2 = number.toFloat()
                    editText?.setText("")
                    isDevide = true
                    number = ""
                }

            }
            R.id.button_minus -> {
                if(number.isNullOrBlank()){
                    editText.setText("")
                }
                else{
                    number2 = number.toFloat()
                    editText?.setText("")
                    isMinus = true
                    number = ""
                }

            }
            R.id.button_equal -> {
                if(isAddition == true){
                    number3 = number.toFloat()
                    editText?.setText((number2+number3).toString())
                    isAddition = false
                }else if(isDevide){
                    number3 = number.toFloat()
                    editText?.setText((number2/number3).toString())
                    isDevide = false
                }else if(isMinus){
                    number3 = number.toFloat()
                    editText?.setText((number2-number3).toString())
                    isMinus = false
                }
            }
        }
    }
}

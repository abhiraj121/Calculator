package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var answer : Int = 0
    lateinit var calc: Array<Array<Button>>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calc = arrayOf(
            arrayOf(no7,no8,no9,divide),
            arrayOf(no4,no5,no6,product),
            arrayOf(no1,no2,no3,minus),
            arrayOf(decimal,no0,result,sum)
        )

        for (i in calc) {
            for (button in i) {
                button.setOnClickListener(this)
            }
        }

    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.divide -> {
                updateDisplay("/")
            }
            R.id.product -> {
                updateDisplay("X")
            }
            R.id.minus -> {
                updateDisplay("-")
            }
            R.id.sum -> {
                updateDisplay("+")
            }
            R.id.no1 -> {
                updateDisplay("1")
                answer = 1
            }
            R.id.no2 -> {
                updateDisplay("2")
                answer = 2
            }
            R.id.no3 -> {
                updateDisplay("3")
                answer = 3
            }
            R.id.no4 -> {
                updateDisplay("4")
                answer = 4
            }
            R.id.no5 -> {
                updateDisplay("5")
                answer = 5
            }
            R.id.no6 -> {
                updateDisplay("6")
                answer = 6
            }
            R.id.no7 -> {
                updateDisplay("7")
                answer = 7
            }
            R.id.no8 -> {
                updateDisplay("8")
                answer = 8
            }
            R.id.no9 -> {
                updateDisplay("9")
                answer = 9
            }
            R.id.decimal -> {
                updateDisplay(".")
            }
        }


    }


    private fun updateDisplay(text: String) {
        disp.text = answer + text
    }

}

package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clean(view: View) {
        disp.setText("")
    }

    fun operationStart(view: View) {
        if(newOp==true){
            disp.text=""
        }
        newOp = false
        val btnStart = view as Button
        var num:String = disp.text.toString()
        when(btnStart.id){
            no0.id-> {
                num+="0"}
            no1.id-> {
                num+="1"}
            no2.id-> {
                num+="2"}
            no3.id-> {
                num+="3"}
            no4.id-> {
                num+="4"}
            no5.id-> {
                num+="5"}
            no6.id-> {
                num+="6"}
            no7.id-> {
                num+="7"}
            no8.id-> {
                num+="8"}
            no9.id-> {
                num+="9"}
            decimal.id-> {
                num+="."}
            product.id-> {
                num+="X"}
            minus.id-> {
                num+="-"}
            divide.id-> {
                num+="/"}
            sum.id-> {
                num+="+"}
        }
        if(num.length>9){
            num = ""
        }
        disp.setText(num)
    }

    var op:String?= null
    var oldNumber = ""
    var newOp = true

    fun operationMid(view: View) {
        var btnMid = view as Button
        when(btnMid.id) {
            sum.id->{
                op = "+"
            }
            divide.id->{
                op = "/"
            }
            minus.id->{
                op = "-"
            }
            product.id->{
                op = "*"
            }
        }
        oldNumber = disp.text.toString()
        newOp = true
    }

    fun answer(view: View) {
        try {
            val newAns = disp.text.toString().toDouble()
            var finalAns: Double? = null
            when (op) {
                "*" -> {
                    finalAns = oldNumber.toDouble() * newAns
                }
                "/" -> {
                    finalAns = oldNumber.toDouble() / newAns
                }
                "-" -> {
                    finalAns = oldNumber.toDouble() - newAns
                }
                "+" -> {
                    finalAns = oldNumber.toDouble() + newAns
                }
            }
            disp.setText(finalAns.toString())
            newOp = true
        }catch (e:Exception){
            disp.setText("")
        }
    }
}

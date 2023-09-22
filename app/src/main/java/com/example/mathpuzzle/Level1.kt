package com.example.mathpuzzle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Level1 : AppCompatActivity() {

    lateinit var one:Button
    lateinit var two:Button
    lateinit var three:Button
    lateinit var four:Button
    lateinit var five:Button
    lateinit var six:Button
    lateinit var seven:Button
    lateinit var eight:Button
    lateinit var nine:Button
    lateinit var zero:Button
    lateinit var submit:Button
    lateinit var delete:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level1)


        one=findViewById(R.id.one)
        two=findViewById(R.id.two)
        three=findViewById(R.id.three)
        four=findViewById(R.id.four)
        five=findViewById(R.id.five)
        six=findViewById(R.id.six)
        seven=findViewById(R.id.seven)
        eight=findViewById(R.id.eight)
        nine=findViewById(R.id.nine)
        zero=findViewById(R.id.zero)
        submit=findViewById(R.id.submit)
        delete=findViewById(R.id.delete)


        one.setOnClickListener {


        }

    }

    fun click(s:String){




    }
}
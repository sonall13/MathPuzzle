package com.example.mathpuzzle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Level1 : AppCompatActivity() {

    lateinit var textview:TextView
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
        textview=findViewById(R.id.textview)


        one.setOnClickListener {
            click("1")
        }


        two.setOnClickListener {
            click("2")
        }

        three.setOnClickListener {
            click("3")
        }

        four.setOnClickListener {
            click("")
        }
        submit.setOnClickListener {

            var sub_intent=Intent(this,Wining_page::class.java)
            startActivity(sub_intent)
        }
    }

    fun click(s:String){
        textview.text= s
    }
}
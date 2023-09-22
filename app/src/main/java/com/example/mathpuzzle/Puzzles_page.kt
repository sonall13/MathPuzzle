package com.example.mathpuzzle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Puzzles_page : AppCompatActivity() {

    lateinit var puzzle1:Button
    lateinit var next:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puzzles_page)

        puzzle1=findViewById(R.id.puzzle1)
        next=findViewById(R.id.next)


        puzzle1.setOnClickListener {

            var l1_intent=Intent(this,Level1::class.java)
            startActivity(l1_intent)
        }
        next.setOnClickListener {

            var l1_intent=Intent(this,next_lockpage::class.java)
            startActivity(l1_intent)

        }

    }
}
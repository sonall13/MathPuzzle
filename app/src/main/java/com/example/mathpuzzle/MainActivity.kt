 package com.example.mathpuzzle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

 class MainActivity : AppCompatActivity() {

    lateinit var con:Button
    lateinit var puzzle:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        con=findViewById(R.id.con)
        puzzle=findViewById(R.id.puzzle)


        con.setOnClickListener {
            var conintent=Intent(this,Continue_page::class.java)
            startActivity(conintent)
        }
        puzzle.setOnClickListener {
            var puzzleintent=Intent(this,Puzzles_page::class.java)
            startActivity(puzzleintent)
        }
    }
}
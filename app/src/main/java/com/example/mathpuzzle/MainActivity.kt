 package com.example.mathpuzzle

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

 class
 MainActivity : AppCompatActivity() {

    lateinit var con:Button
    lateinit var puzzle:Button
companion object{
    lateinit var sp : SharedPreferences
    lateinit var editior : SharedPreferences.Editor
}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sp = getSharedPreferences("mm", 0)
        editior = sp.edit();

  var level =  sp.getInt("level", 0)

        con=findViewById(R.id.con)
        puzzle=findViewById(R.id.puzzle)


        con.setOnClickListener {
            var conintent=Intent(this,Level1::class.java).putExtra("cnt",level)
            startActivity(conintent)
        }
        puzzle.setOnClickListener {
            var puzzleintent=Intent(this,Puzzles_page::class.java)
            startActivity(puzzleintent)
        }
    }
}
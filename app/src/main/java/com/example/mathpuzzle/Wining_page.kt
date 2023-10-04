package com.example.mathpuzzle

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Wining_page : AppCompatActivity() {

    lateinit var con_win: Button
    lateinit var menu: Button
    lateinit var puzzlecoard: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wining_page)

        con_win = findViewById(R.id.con_win)
        menu = findViewById(R.id.menu)
        puzzlecoard = findViewById(R.id.puzzlecoard)

        var pos = intent.getIntExtra("position", 0)
        puzzlecoard.text = "Puzzle $pos Completed "


        menu.setOnClickListener {

            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
        con_win.setOnClickListener {
            var intent = Intent(this,Level1::class.java).putExtra("cnt", pos)
            startActivity(intent)
        }

    }
}
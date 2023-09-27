package com.example.mathpuzzle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Wining_page : AppCompatActivity() {

    lateinit var con_win:Button
    lateinit var menu:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wining_page)

        con_win=findViewById(R.id.con_win)
        menu=findViewById(R.id.menu)

        var pos=intent.getIntExtra("position",0)

        menu.setOnClickListener {

            var intent=Intent(this,MainActivity::class.java)
            startActivity(intent)

        }
        con_win.setOnClickListener {
            var intent=Intent(this,Level1::class.java)
            startActivity(intent)
        }

    }
}
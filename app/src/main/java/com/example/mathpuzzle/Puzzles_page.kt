package com.example.mathpuzzle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class Puzzles_page : AppCompatActivity() {


    lateinit var gridView: GridView

    var arrayofalevel = arrayOf<String>(
        "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
        "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
        "31", "32", "33", "34", "35", "36", "37", "38", "39", "40",
        "41", "42", "43", "44", "45", "46", "47", "48", "49", "50",
        "51", "52", "53", "54", "55", "56", "57", "58", "59", "60",
        "61", "62", "63", "64", "65", "66", "67", "68", "69", "70",
        "71", "72", "73", "74", "75"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puzzles_page)

        gridView=findViewById(R.id.gridviwe)

        var mylevel=intent.getIntExtra("mylevel",0)

        var gridadapter = Gridadapter(this,arrayofalevel,mylevel)
        gridView.adapter = gridadapter


        gridView.setOnItemClickListener { adapterView, view, i, l ->

            var  intentlevel=Intent(this,Level1::class.java).putExtra("cnt" ,i)
            startActivity(intentlevel)
            finish()
        }

    }
}
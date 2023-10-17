package com.example.mathpuzzle

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class
MainActivity : AppCompatActivity() {

    lateinit var con: Button
    lateinit var puzzle: Button

    // Lock , Clear , Skip

    companion object {

        var statuslist = ArrayList<String>()
        var Islock = "Lock"
        var Isskip = "skip"
        var Isclear = "clear"
        lateinit var sp: SharedPreferences
        lateinit var editior: SharedPreferences.Editor
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sp = getSharedPreferences("mm", 0)
        editior = sp.edit()

        var level = sp.getInt("level", 0)

        //5
        // status0 = lock
        // status1 = lock
        // status2 = lock
        // status3 = lock
        // status4 = lock

        for (index in 0..74) {
            var levelstatus = sp.getString("status$index", Islock)
//            Log.e("=====", "onCreate: $levelstatus")
            statuslist.add(levelstatus!!)
//            Log.e("=====", "onCreate: $statuslist")
//            println("===== onCreate: $statuslist")

//            Toast.makeText(this@MainActivity, "$statuslist", Toast.LENGTH_LONG).show()
        }

        con = findViewById(R.id.con)
        puzzle = findViewById(R.id.puzzle)


        con.setOnClickListener {
            var conintent = Intent(this, Level1::class.java).putExtra("cnt", level)
            startActivity(conintent)
            finish()
        }
        puzzle.setOnClickListener {
            var puzzleintent = Intent(this, Puzzles_page::class.java).putExtra("mylevel",level)
            startActivity(puzzleintent)
            finish()
        }
    }
}
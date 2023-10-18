package com.example.mathpuzzle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.lang.Exception
import java.lang.NullPointerException

class Level1 : AppCompatActivity() {

    lateinit var textview: TextView
    lateinit var one: Button
    lateinit var two: Button
    lateinit var three: Button
    lateinit var four: Button
    lateinit var five: Button
    lateinit var six: Button
    lateinit var seven: Button
    lateinit var eight: Button
    lateinit var nine: Button
    lateinit var zero: Button
    lateinit var submit: Button
    lateinit var delete: Button
    lateinit var levelimage: LinearLayout
    lateinit var levelboard: TextView
    lateinit var skip: ImageView
    lateinit var hint: ImageView


    var arrayoflevel = arrayListOf<Int>(
        R.drawable.p1,
        R.drawable.p2,
        R.drawable.p3,
        R.drawable.p4,
        R.drawable.p5,
        R.drawable.p6,
        R.drawable.p7,
        R.drawable.p8,
        R.drawable.p9,
        R.drawable.p10,

        R.drawable.p11,
        R.drawable.p12,
        R.drawable.p13,
        R.drawable.p14,
        R.drawable.p15,
        R.drawable.p16,
        R.drawable.p17,
        R.drawable.p18,
        R.drawable.p19,
        R.drawable.p20,

        R.drawable.p21,
        R.drawable.p22,
        R.drawable.p23,
        R.drawable.p24,
        R.drawable.p25,
        R.drawable.p26,
        R.drawable.p27,
        R.drawable.p28,
        R.drawable.p29,
        R.drawable.p30,

        R.drawable.p31,
        R.drawable.p32,
        R.drawable.p33,
        R.drawable.p34,
        R.drawable.p35,
        R.drawable.p36,
        R.drawable.p37,
        R.drawable.p38,
        R.drawable.p39,
        R.drawable.p40,

        R.drawable.p41,
        R.drawable.p42,
        R.drawable.p43,
        R.drawable.p44,
        R.drawable.p45,
        R.drawable.p46,
        R.drawable.p47,
        R.drawable.p48,
        R.drawable.p49,
        R.drawable.p50,

        R.drawable.p51,
        R.drawable.p52,
        R.drawable.p53,
        R.drawable.p54,
        R.drawable.p55,
        R.drawable.p56,
        R.drawable.p57,
        R.drawable.p58,
        R.drawable.p59,
        R.drawable.p60,

        R.drawable.p61,
        R.drawable.p62,
        R.drawable.p63,
        R.drawable.p64,
        R.drawable.p65,
        R.drawable.p66,
        R.drawable.p67,
        R.drawable.p68,
        R.drawable.p69,
        R.drawable.p70,

        R.drawable.p71,
        R.drawable.p72,
        R.drawable.p73,
        R.drawable.p74,
        R.drawable.p75
    )

    var arrayofanswer = arrayOf<String>(
        "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
        "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
        "31", "32", "33", "34", "35", "36", "37", "38", "39", "40",
        "41", "42", "43", "44", "45", "46", "47", "48", "49", "50",
        "51", "52", "53", "54", "55", "56", "57", "58", "59", "60",
        "61", "62", "63", "64", "65", "66", "67", "68", "69", "70",
        "71", "72", "73", "74", "75"
    )


    var mybutton = ArrayList<Button>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level1)

        one = findViewById(R.id.one)
        skip = findViewById(R.id.skip)
        levelboard = findViewById(R.id.levelboard)
        two = findViewById(R.id.two)
        three = findViewById(R.id.three)
        four = findViewById(R.id.four)
        five = findViewById(R.id.five)
        six = findViewById(R.id.six)
        seven = findViewById(R.id.seven)
        eight = findViewById(R.id.eight)
        nine = findViewById(R.id.nine)
        zero = findViewById(R.id.zero)
        submit = findViewById(R.id.submit)
        delete = findViewById(R.id.delete)
        textview = findViewById(R.id.textview)
        levelimage = findViewById(R.id.levelimage)
        hint = findViewById(R.id.hint)

        myclicjk(0,one)
        myclicjk(1,two)
        myclicjk(2,three)
        myclicjk(3,four)
        myclicjk(4,five)
        myclicjk(5,six)
        myclicjk(6,seven)
        myclicjk(7,eight)
        myclicjk(8,nine)
        myclicjk(9,zero)

        var level = intent.getIntExtra("cnt", 0)
        levelboard.setText("Puzzle ${level + 1}")
        levelimage.setBackgroundResource(arrayoflevel[level])

        hint.setOnClickListener {
            Toast.makeText(this, "${arrayofanswer[level]}", Toast.LENGTH_LONG).show()
        }

        skip.setOnClickListener {
            // List    = 0
            // prefrnce  = status0
            if (MainActivity.statuslist[level] == MainActivity.Isclear) {
                level++
                MainActivity.editior.apply()
//              Log.e("=Level", "onCreate: ${MainActivity.statuslist.toList()}")
                startActivity(Intent(this@Level1, Level1::class.java).putExtra("cnt", level))
                finish()
            }
            else
            {
                MainActivity.statuslist[level] = MainActivity.Isskip
                MainActivity.editior.putString("status$level", MainActivity.Isskip)

                level++
                MainActivity.editior.putInt("level", level)
                MainActivity.editior.apply()
//              Log.e("=Level", "onCreate: ${MainActivity.statuslist.toList()}")
                startActivity(Intent(this@Level1, Level1::class.java).putExtra("cnt", level))
                finish()
            }
        }
        delete.setOnClickListener{
            try {
                textview.text = textview.text.toString().substring(0,textview.text.toString().length-1)
            }
            catch ( i : Exception)
            {
            }
        }
        submit.setOnClickListener {

            if (MainActivity.statuslist[level] == MainActivity.Isclear){

                var sub_intent = Intent(this, Wining_page::class.java)
                startActivity(sub_intent.putExtra("position", level+1))
            }

            if (textview.text == arrayofanswer[level]) {
                MainActivity.editior.putString("status$level",MainActivity.Isclear)
                MainActivity.editior.apply()
                MainActivity.statuslist[level] = MainActivity.Isclear

                level++
                MainActivity.editior.putInt("level", level)
                MainActivity.editior.apply()

                var sub_intent = Intent(this, Wining_page::class.java)
                startActivity(sub_intent.putExtra("position", level))
                finish()
            }
            else
            {
                Toast.makeText(this, "WRONG!", Toast.LENGTH_SHORT).show()
            }
        }
    }
    fun myclicjk(position: Int, button: Button)
    {
        mybutton.add(button)
        mybutton[position].setOnClickListener {
            textview.text = textview.text.toString()+mybutton[position].text.toString()
        }

    }
}
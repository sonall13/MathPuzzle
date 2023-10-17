package com.example.mathpuzzle

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button

class Gridadapter(var puzzlesPage: Puzzles_page, var arrayofalevel: Array<String>,var mylevel: Int) : BaseAdapter() {
    override fun getCount(): Int {
        return arrayofalevel.size
    }
    override fun getItem(p0: Int): Any {
     return p0
    }
    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        var btn : Button
        var forlevel = LayoutInflater.from(puzzlesPage).inflate(R.layout.forlevel,p2,false)

        btn = forlevel.findViewById(R.id.btn)
        if(MainActivity.statuslist[p0] == MainActivity.Islock)
        {
            btn.setBackgroundResource(R.drawable.lock)
        }
        else if(MainActivity.statuslist[p0] == MainActivity.Isskip)
        {
            btn.setText("${p0+1}")
        }
        else if(MainActivity.statuslist[p0] == MainActivity.Isclear)
        {
            btn.setText("${p0+1}")
            btn.setBackgroundResource(R.drawable.tick)
//            Log.e("+++", "getView: abc..", )
        }
        if(p0==mylevel)
        {
            btn.setText("${p0+1}")
            btn.setBackgroundResource(R.drawable.background)
        }

        return forlevel
    }

}

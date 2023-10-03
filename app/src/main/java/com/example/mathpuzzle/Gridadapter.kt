package com.example.mathpuzzle

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class Gridadapter(var puzzlesPage: Puzzles_page,var arrayofalevel1: String) : BaseAdapter() {
    override fun getCount(): Int {
        return arrayofalevel1.length
    }

    override fun getItem(p0: Int): Any {
     return p0
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        TODO("Not yet implemented")
    }

}

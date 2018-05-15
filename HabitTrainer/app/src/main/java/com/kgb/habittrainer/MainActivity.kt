package com.kgb.habittrainer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_description.text = "A refreshing glass of watter gets you hydrated"
        tv_title.text = "Drink water"
        iv_icon.setImageResource(R.drawable.water)
    }
}

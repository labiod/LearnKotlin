package com.kgb.imageviewapp

import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        marioImg.setColorFilter(Color.BLUE)
        skullImg.setColorFilter(Color.CYAN)

        marioImg.setOnClickListener {
            //marioImg.clearColorFilter()
            marioImg.setColorFilter(Color.GREEN, PorterDuff.Mode.DARKEN)
        }
    }
}

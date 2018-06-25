package com.kgb.randombackgroundcolor

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.ColorRes
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colorArray = arrayOf(
                Color.BLACK, Color.WHITE, Color.TRANSPARENT,
                Color.RED, Color.GREEN, Color.BLUE,
                Color.CYAN, Color.MAGENTA, Color.YELLOW,
                Color.GRAY, Color.DKGRAY, Color.LTGRAY
        )

        tapButton.setOnClickListener {
            mainView.setBackgroundColor(Color.MAGENTA)
        }
    }
}

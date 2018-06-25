package com.kgb.imagefilterapp

import android.graphics.Color
import android.graphics.PorterDuff
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colorsArray = arrayOf(
                Color.BLACK, Color.CYAN, Color.BLUE,
                Color.GREEN, Color.DKGRAY, Color.RED,
                Color.GRAY, Color.MAGENTA, Color.YELLOW)

        val porterModes = arrayOf(
                PorterDuff.Mode.OVERLAY, PorterDuff.Mode.DST_ATOP, PorterDuff.Mode.DARKEN,
                PorterDuff.Mode.ADD, PorterDuff.Mode.LIGHTEN, PorterDuff.Mode.SCREEN
        )

        catImageView.setOnClickListener {
            val num = getRandom(colorsArray.size)
            catImageView.setColorFilter(colorsArray[num], porterModes[getRandom(porterModes.size)])
            println(num)
        }
    }

    fun getRandom(arraySize: Int): Int {
        var rand = Random()
        var randomNum = rand.nextInt(arraySize)
        return randomNum
    }
}

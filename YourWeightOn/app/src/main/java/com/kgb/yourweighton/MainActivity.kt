package com.kgb.yourweighton

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.CheckBox
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    val marsGravity: Float = 0.38f
    val venusGravity: Float = 0.91f
    val jupiterGravity: Float = 2.34f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showWeightButtonId.setOnClickListener {
            //show our calculations to get weight on Mars
//            var result: Double = calculateWeight(weight.toString().toDouble())

        }

        marsCheckbox.setOnClickListener(this)
        venusCheckbox.setOnClickListener(this)
        jupiterCheckbox.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        v as CheckBox
        var isChecked: Boolean = v.isChecked
        var weight = enterWeightId.text.toString()

        when(v.id) {
            R.id.marsCheckbox -> if (isChecked && !TextUtils.isEmpty(weight)) {
                calculateWeight(weight.toDouble(), v)
                venusCheckbox.isChecked = false
                jupiterCheckbox.isChecked = false
            }
            R.id.venusCheckbox -> if (isChecked && !TextUtils.isEmpty(weight)) {
                calculateWeight(weight.toDouble(), v)
                marsCheckbox.isChecked = false
                jupiterCheckbox.isChecked = false
            }
            R.id.jupiterCheckbox -> if (isChecked && !TextUtils.isEmpty(weight)) {
                calculateWeight(weight.toDouble(), v)
                venusCheckbox.isChecked = false
                marsCheckbox.isChecked = false
            }
        }
    }

    fun calculateWeight(userWeight: Double, checkBox: CheckBox) {
        var result: Double?
        when(checkBox.id) {
            R.id.marsCheckbox ->  {
                result = userWeight * marsGravity
                resultTextViewId.text = "Weight is ${result.format(2)} On Mars"
            }
            R.id.venusCheckbox -> {
                result = userWeight * venusGravity
                resultTextViewId.text = "Weight is ${result.format(2)} On Venus"
            }
            R.id.jupiterCheckbox -> {
                result = userWeight * jupiterGravity
                resultTextViewId.text = "Weight is ${result.format(2)} On Jupiter"
            }
            else -> userWeight * marsGravity
        }

    }

}

fun Double.format(digits: Int) = String.format("%.${digits}f", this)

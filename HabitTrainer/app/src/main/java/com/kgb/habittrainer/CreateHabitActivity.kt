package com.kgb.habittrainer

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.EditText
import com.kgb.habittrainer.db.HabitDBTable
import kotlinx.android.synthetic.main.activity_create_habit.*
import java.io.IOException

class CreateHabitActivity : AppCompatActivity() {
    private val TAG = CreateHabitActivity::class.java.simpleName
    private val CHOOSE_IMAGE_REQUEST = 1
    private var imageBitmap: Bitmap? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_habit)
    }

    fun chooseImage(v: View) {
        val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT
        val chooser = Intent.createChooser(intent, "Choose iage for habit")
        startActivityForResult(chooser, CHOOSE_IMAGE_REQUEST)
        Log.d(TAG, "Intent to choose image sent...")
    }

    fun storeHabit(v: View) {
        if (et_title.isBlank() || et_descr.isBlank()) {
            Log.d(TAG, "No habit stored: titled or description missing")
            displayErrorMessage("Your habit nees an engaging title and description")
            return
        } else if(imageBitmap == null) {
            Log.d(TAG, "No habit stored: image is missing")
            displayErrorMessage("Add a motivation picture to your habit")
            return
        }

        val title = et_title.text.toString()
        val description = et_descr.text.toString()
        val habit = Habit(title, description, imageBitmap!!)
        val id = HabitDBTable(this).store(habit)
        if (id == -1L) {
            displayErrorMessage("Habit could not be stored..let's not make this a habit")
        } else {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun displayErrorMessage(errorMsg: String) {
        tv_error.text = errorMsg
        tv_error.visibility = View.VISIBLE

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == CHOOSE_IMAGE_REQUEST && resultCode == Activity.RESULT_OK
            && data != null && data.data != null) {
            imageBitmap = tryReadBitmap(data.data)
            imageBitmap?.let {
                iv_image_preview.setImageBitmap(imageBitmap)
                Log.d(TAG,"Read image bitmap and updated image view")
            }
        }
    }

    private fun tryReadBitmap(data: Uri): Bitmap? {
        return try {
            MediaStore.Images.Media.getBitmap(contentResolver, data)
        } catch (e : IOException) {
            e.printStackTrace()
            null
        }
    }
}

private fun EditText.isBlank() = this.text.toString().isBlank()

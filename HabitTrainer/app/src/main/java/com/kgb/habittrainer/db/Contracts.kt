package com.kgb.habittrainer.db

import android.provider.BaseColumns

/**
 * @author Krzysztof Betlej <k.betlej@samsung.com>.
 * @date 5/21/18
 * @copyright Copyright (c) 2016 by Samsung Electronics Polska Sp. z o. o.
 */
val DATABASE_NAME = "habittrainer.db"
val DATABASE_VERSION = 1

object HabitEntry : BaseColumns {
    val _ID = "id"
    val TABLE_NAME = "habit"
    val TITLE_COL = "title"
    val DESCR_COL = "description"
    val IMAGE_COL = "image"
}


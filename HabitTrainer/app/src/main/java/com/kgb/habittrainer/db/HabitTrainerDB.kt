package com.kgb.habittrainer.db

import android.database.sqlite.SQLiteOpenHelper
import android.content.Context
import android.database.sqlite.SQLiteDatabase

/**
 * @author Krzysztof Betlej <k.betlej@samsung.com>.
 * @date 5/21/18
 * @copyright Copyright (c) 2016 by Samsung Electronics Polska Sp. z o. o.
 */
class HabitTrainerDB(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    private val SQL_CREATE_ENTRIES = "CREATE TABLE ${HabitEntry.TABLE_NAME} (" +
            "${HabitEntry._ID} INTEGER PRIMARY KEY," +
            "${HabitEntry.TITLE_COL} TEXT," +
            "${HabitEntry.DESCR_COL} TEXT," +
            "${HabitEntry.IMAGE_COL} BLOB" +
            ")"

    private val SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS ${HabitEntry.TABLE_NAME}"
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(SQL_CREATE_ENTRIES)
    }

    override fun onUpgrade(db: SQLiteDatabase, p1: Int, p2: Int) {
        db.execSQL(SQL_DELETE_ENTRIES)
        onCreate(db)
    }
}
package com.kgb.habittrainer

import android.graphics.Bitmap
import android.util.EventLogTags

/**
 * @author Krzysztof Betlej <k.betlej@samsung.com>.
 * @date 5/21/18
 * @copyright Copyright (c) 2016 by Samsung Electronics Polska Sp. z o. o.
 */
data class Habit(val title: String,
                 val description: String,
                 val image: Bitmap)

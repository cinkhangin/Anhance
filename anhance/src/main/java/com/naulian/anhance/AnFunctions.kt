package com.naulian.anhance

import android.content.Context
import android.widget.Toast

fun showTextToast(context: Context, message: String) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}

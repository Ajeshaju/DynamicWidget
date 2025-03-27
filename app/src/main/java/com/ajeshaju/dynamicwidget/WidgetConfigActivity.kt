
package com.ajeshaju.dynamicwidget

import android.appwidget.AppWidgetManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class WidgetConfigActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_widget_config)

        val editText = findViewById<EditText>(R.id.editWidgetText)
        val btnSave = findViewById<Button>(R.id.btnSaveWidget)

        btnSave.setOnClickListener {
            val sharedPrefs = getSharedPreferences("WidgetPrefs", Context.MODE_PRIVATE)
            sharedPrefs.edit().putString("widgetText", editText.text.toString()).apply()

            val result = Intent()
            result.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, AppWidgetManager.INVALID_APPWIDGET_ID)
            setResult(RESULT_OK, result)
            finish()
        }
    }
}

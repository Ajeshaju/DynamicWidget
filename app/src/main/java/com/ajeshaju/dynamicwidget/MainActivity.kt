
package com.ajeshaju.dynamicwidget

import android.appwidget.AppWidgetManager
import android.content.ComponentName
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnAddWidget).setOnClickListener {
            val intent = Intent(AppWidgetManager.ACTION_APPWIDGET_PICK)
            startActivity(intent)
        }
    }
}

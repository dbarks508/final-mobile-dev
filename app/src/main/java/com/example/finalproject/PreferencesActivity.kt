package com.example.finalproject

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.preference.PreferenceManager
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.finalproject.R.*

class PreferencesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_preferences)

        // buttons
        val yellowButton : Button = findViewById(id.yellowButton)
        val greyButton: Button = findViewById(id.greyButton)
        val pinkButton: Button = findViewById(id.pinkButton)

        val imageButton: ImageButton = findViewById(id.imageButton)
        imageButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        yellowButton.setOnClickListener {
            val color: String = "yellow"
            val preferences: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
            preferences.edit().putString("myColor", color).apply()
        }
        greyButton.setOnClickListener {
            val color: String = "grey"
            val preferences: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
            preferences.edit().putString("myColor", color).apply()
        }
        pinkButton.setOnClickListener {
            val color: String = "pink"
            val preferences: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
            preferences.edit().putString("myColor", color).apply()
        }
    }
}
package com.example.finalproject

import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.text.Layout
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_main.*
import java.text.ParseException
import java.util.logging.Level.parse

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // second activity intent
        val addItemButton: Button = findViewById(R.id.addBtn)
        addItemButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        } // end event listener

        // preferences activity intent
        val preferencesButton: Button = findViewById(R.id.settingsBtn)
        preferencesButton.setOnClickListener {
            val intent = Intent(this, PreferencesActivity::class.java)
            startActivity(intent)
        } // end event listener

        // help activity intent
        val helpButton: Button = findViewById(R.id.helpBtn)
        helpButton.setOnClickListener {
            val intent = Intent(this, HelpActivity::class.java)
            startActivity(intent)
        } // end event listener

        // getting intent extras
        firstTrainingItem.text = intent.getStringExtra("firstTrainingItem")
        secondTrainingItem.text = intent.getStringExtra("secondTrainingItem")
        thirdTrainingItem.text = intent.getStringExtra("thirdTrainingItem")
        fourthTrainingItem.text = intent.getStringExtra("fourthTrainingItem")
        fifthTrainingItem.text = intent.getStringExtra("fifthTrainingItem")

        val phraseArray = arrayListOf<String>("First objective Down.", "keep the momentum going!", "Three items completed.", "You're crushing", "Workout complete!")

        checkBox1.setOnClickListener {
            progressDisplay.text = phraseArray[0]
        }
        checkBox2.setOnClickListener {
            progressDisplay.text = phraseArray[1]
        }
        checkBox3.setOnClickListener {
            progressDisplay.text = phraseArray[2]
        }
        checkBox4.setOnClickListener {
            progressDisplay.text = phraseArray[3]
        }
        checkBox5.setOnClickListener {
            progressDisplay.text = phraseArray[4]
        }



        val myLayout = findViewById<ConstraintLayout>(R.id.rootLayout)

        val preferences: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)

        val col: String? = preferences.getString("myColor", "")
        if (col == "yellow"){
            myLayout.setBackgroundColor(Color.YELLOW)
        } else if (col == "grey") {
            myLayout.setBackgroundColor(Color.LTGRAY)
        } else if (col == "pink") {
            myLayout.setBackgroundColor(Color.MAGENTA)
        }



    } // end function onCreate
} // end Class
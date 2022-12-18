package com.example.finalproject
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_secondary.*

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

        var itemsArray = arrayListOf<String>("hello")

       sendBtn.setOnClickListener {
           var intent = Intent(this, MainActivity::class.java)
           intent.putExtra("firstTrainingItem", trainingItem1.text.toString())
           intent.putExtra("secondTrainingItem", trainingItem2.text.toString())
           intent.putExtra("thirdTrainingItem", trainingItem3.text.toString())
           intent.putExtra("fourthTrainingItem", trainingItem4.text.toString())
           intent.putExtra("fifthTrainingItem", trainingItem5.text.toString())
           startActivity(intent)
       }
    }
}
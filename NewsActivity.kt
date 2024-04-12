package com.example.waterp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.widget.Button

class NewsActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)


        val infoButton = findViewById<Button>(R.id.onInfoButtonClicked)

    }
}

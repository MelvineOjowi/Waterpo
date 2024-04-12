package com.example.waterp
import android.content.Intent
import android.widget.Button
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val infoButton = findViewById<Button>(R.id.onInfoButtonClicked)

        infoButton.setOnClickListener {
        val intent = Intent(this, NewsActivity::class.java)
        startActivity(intent)
            }
        }
}
package com.example.minorprojectassignment

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        // Retrieve data from Intent
        val finalData = intent.getStringExtra("final_data")

        // Display the final data in a TextView
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = finalData
    }
}

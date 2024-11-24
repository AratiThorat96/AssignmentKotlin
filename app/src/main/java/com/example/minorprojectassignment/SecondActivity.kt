package com.example.minorprojectassignment


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Retrieve data from Intent
        val stringOne = intent.getStringExtra("string_one")
        val stringTwo = intent.getStringExtra("string_two")
        val stringThree = intent.getStringExtra("string_three")
        val stringFour = intent.getStringExtra("string_four")
        val stringFive = intent.getStringExtra("string_five")
        val booleanValue = intent.getBooleanExtra("boolean_value", false)
        val integerValue = intent.getIntExtra("integer_value", 0)
        val floatValue = intent.getFloatExtra("float_value", 0.0f)

        // Combine all data into one string
        val combinedData = """
            $stringOne
            $stringTwo
            $stringThree
            $stringFour
            $stringFive
            Boolean: $booleanValue
            Integer: $integerValue
            Float: $floatValue
        """.trimIndent()

        // Show in TextView and Logcat
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = combinedData
        Log.d("SecondActivity", combinedData)

        // Button to send data to ThirdActivity
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("final_data", combinedData)
            startActivity(intent)
        }
    }
}

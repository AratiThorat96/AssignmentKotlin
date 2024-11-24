package com.example.minorprojectassignment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set TextView contents from strings.xml
        val textView1 = findViewById<TextView>(R.id.textView1)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val textView3 = findViewById<TextView>(R.id.textView3)
        val textView4 = findViewById<TextView>(R.id.textView4)
        val textView5 = findViewById<TextView>(R.id.textView5)

        textView1.text = getString(R.string.string_one)
        textView2.text = getString(R.string.string_two)
        textView3.text = getString(R.string.string_three)
        textView4.text = getString(R.string.string_four)
        textView5.text = getString(R.string.string_five)

        // Set up button click listener to send data to SecondActivity
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("string_one", textView1.text.toString())
            intent.putExtra("string_two", textView2.text.toString())
            intent.putExtra("string_three", textView3.text.toString())
            intent.putExtra("string_four", textView4.text.toString())
            intent.putExtra("string_five", textView5.text.toString())
            intent.putExtra("boolean_value", true)
            intent.putExtra("integer_value", 42)
            intent.putExtra("float_value", 3.14f)
            startActivity(intent)
        }
    }
}

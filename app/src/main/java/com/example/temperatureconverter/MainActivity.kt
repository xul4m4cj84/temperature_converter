package com.example.temperatureconverter

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.convert_button).setOnClickListener{
            temperateness()
        }
    }

    private fun temperateness(){
        val editText = findViewById<EditText>(R.id.editText_temperature)
        val editTextInt = editText.text.toString().toFloat()
        val textView = findViewById<TextView>(R.id.output_textView)
        textView.text = ((editTextInt-32)*5/9).toString()
    }
}

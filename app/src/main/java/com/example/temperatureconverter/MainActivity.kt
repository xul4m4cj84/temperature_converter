package com.example.temperatureconverter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.temperatureconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val newName: NewName = NewName("溫度轉換","輸出攝氏溫度")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.newName = newName

        binding.convertButton.setOnClickListener {
            temperateness()
        }
    }

    private fun temperateness(){
        binding.newName?.number = binding.outputTextView.text.toString()
        binding.invalidateAll()
        binding.outputTextView.text = ((binding.editTextTemperature.text.toString().toFloat()-32)*5/9).toString()
    }
}

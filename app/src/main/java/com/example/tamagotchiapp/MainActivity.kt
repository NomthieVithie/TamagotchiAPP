package com.example.tamagotchiapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//Set the layout for this activity to activity_main.xml


        val button = findViewById<Button>(R.id.button)//find the button using its ID
        button.setOnClickListener {
            //create intent to start MainActivity2
            val intent = Intent(this, MainActivity2::class.java) // You can omit the full package if in the same package
            startActivity(intent) // Start the new activity
        }
    }
}

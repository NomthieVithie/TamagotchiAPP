package com.example.tamagotchiapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    // Variables to see if the pet's status is hungry, playful, or clean
    private var hunger = 60
    private var happy = 50
    private var clean = 30

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // UI IDs
        val btnFeed = findViewById<Button>(R.id.btnFeed) // button to Feed
        val btnClean = findViewById<Button>(R.id.btnClean) // button to Clean
        val btnPlay = findViewById<Button>(R.id.btnPlay) // button to Play
        val txtHunger = findViewById<TextView>(R.id.txtHunger) // textview for the hunger level
        val txtHappy = findViewById<TextView>(R.id.txtHappy) // textview for the happiness level
        val txtClean = findViewById<TextView>(R.id.txtClean) // textview for the pet's cleanliness
        val imageView2 = findViewById<ImageView>(R.id.imageView2) // imageview for the virtual pet

        // Initialize TextViews to the current status of the pet
        updateMoodTextViews(txtHunger, txtHappy, txtClean)

        // Set OnClickListeners for the buttons
        btnFeed.setOnClickListener {
            hunger += 5 // increase the hunger level when the pet is fed
            happy += 10 // increase the happiness level when the pet is fed
            clean += 10 // increase the cleanliness level when the pet is fed
            limitMoodLevels() // enforce limits
            updateMoodTextViews(txtHunger, txtHappy, txtClean) // update the textviews
            animateImageChange(imageView2, R.drawable.eating) // change image of the pet to eating
        }

        // Set OnClickListener for the button (Clean)
        btnClean.setOnClickListener {
            clean += 10 // increase cleanliness level when the pet is cleaned
            limitMoodLevels() // enforce limits
            updateMoodTextViews(txtHunger, txtHappy, txtClean) // update the textviews
            animateImageChange(imageView2, R.drawable.bathing) // change image of the pet to bathing
        }

        // Set OnClickListener for the button (Play)
        btnPlay.setOnClickListener {
            happy += 5 // increase happiness level when the pet plays
            limitMoodLevels() // enforce limits
            updateMoodTextViews(txtHunger, txtHappy, txtClean) // update the textviews
            animateImageChange(imageView2, R.drawable.playing) // change image of the pet to playing
        }
    }

    // Function to limit the mood levels to a maximum of 100
    private fun limitMoodLevels() {
        hunger = hunger.coerceAtMost(100)
        happy = happy.coerceAtMost(100)
        clean = clean.coerceAtMost(100)
    }

    // Function to update the TextViews for hunger, happiness, and cleanliness
    private fun updateMoodTextViews(txtHunger: TextView, txtHappy: TextView, txtClean: TextView) {
        txtHunger.text = hunger.toString()
        txtHappy.text = happy.toString()
        txtClean.text = clean.toString()
    }

    // Function to change the pet's image
    private fun animateImageChange(imageView: ImageView, newImageRes: Int) {
        imageView.setImageResource(newImageRes) // set new image resource
    }
}

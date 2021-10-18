package com.reen.multipleviewholders

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.reen.multipleviewholders.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        val landmarks = LandmarkModel.getLandmarks()
        mainBinding.landmarkRecyclerview.apply {
            adapter = LandmarkAdapter(landmarks)
        }
    }
}
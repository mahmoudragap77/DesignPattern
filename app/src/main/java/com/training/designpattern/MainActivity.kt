package com.training.designpattern

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.training.designpattern.builderpattern.UserProfileBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val builder = UserProfileBuilder.Builder()
            .setName("John")
            .setAge(25)
            .setAddress("123 Main St")
            .setEmail("John@example.com")
            .build()

        Log.d("UserProfile", builder.toString())

    }
}
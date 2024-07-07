package com.training.designpattern

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.training.designpattern.builderpattern.UserProfileBuilder
import com.training.designpattern.factorypattern.CreatorNotification
import com.training.designpattern.factorypattern.Notification
import com.training.designpattern.singletonpattern.DataBase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        builderPattern()
        factoryPattern()
        singletonPattern()
    }

    private fun singletonPattern() {  //this is singleton pattern example
        DataBase.insert()
    }

    private fun factoryPattern() { // this is factory pattern example
        val factory = CreatorNotification()
        val notification = factory.createNotification("email")
        notification.sendNotification("Hello, World!")
        Log.d("Notification", "Notification sent ${notification::class.java.simpleName}")
    }

    private fun builderPattern() { // this is builder pattern example
        val builder = UserProfileBuilder.Builder()
            .setName("John")
            .setAge(25)
            .setAddress("123 Main St")
            .setEmail("John@example.com")
            .build()

        Log.d("UserProfile", builder.toString())
    }

}
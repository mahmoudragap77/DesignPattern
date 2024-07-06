package com.training.designpattern.factorypattern

import android.util.Log

class EmailNotification :Notification {
    override fun sendNotification(message: String) {
        Log.d("Notification", "Sending email notification: $message")
    }
}
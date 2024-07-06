package com.training.designpattern.factorypattern

import android.util.Log

class SmsNotification: Notification {
    override fun sendNotification(message: String) {
        Log.d("Notification", "Sending SMS notification: $message")
    }
}
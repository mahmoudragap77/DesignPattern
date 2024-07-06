package com.training.designpattern.factorypattern

 class CreatorNotification {
     fun createNotification(message: String): Notification{

         return when (message) {
             "email" -> EmailNotification()
             "sms" -> SmsNotification()
             else -> throw IllegalArgumentException("Invalid notification type")
         }
     }
}
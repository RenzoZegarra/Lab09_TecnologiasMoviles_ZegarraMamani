package com.renzo.firebasefcm

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class PushNotification : FirebaseMessagingService() {

    override fun onMessageReceived(message: RemoteMessage) {

        super.onMessageReceived(message)

        Log.d(
            "FCM",
            "Mensaje: ${message.notification?.body}"
        )

    }

    override fun onNewToken(token: String) {

        super.onNewToken(token)

        Log.d(
            "TOKEN_FCM",
            token
        )
    }
}
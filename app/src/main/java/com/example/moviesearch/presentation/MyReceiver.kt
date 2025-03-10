package com.example.moviesearch.presentation

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast
import javax.inject.Inject

class MyReceiver @Inject constructor(): BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        when(intent?.action){
            Intent.ACTION_AIRPLANE_MODE_CHANGED-> {
                Toast.makeText(context, "Airplane mode change", Toast.LENGTH_SHORT).show()
            }
            Intent.ACTION_BATTERY_LOW->{
                Toast.makeText(context, "low battery charge", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
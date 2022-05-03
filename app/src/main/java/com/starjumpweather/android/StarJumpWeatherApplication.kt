package com.starjumpweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.media.session.MediaSession

class StarJumpWeatherApplication:Application() {


    companion object {

        const val TOKEN = "2FLFN7QxzXD8AcIb"

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }



}
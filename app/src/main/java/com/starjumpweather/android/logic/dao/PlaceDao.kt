package com.starjumpweather.android.logic.dao

import android.content.Context
import android.provider.Settings.Global.putString
import androidx.core.content.edit
import com.google.gson.Gson
import com.starjumpweather.android.StarJumpWeatherApplication
import com.starjumpweather.android.logic.model.Place

object PlaceDao {
    fun savePlace(place: Place) {
        sharedPreferences().edit {
            putString("place", Gson().toJson(place))
        }
    }

    fun getSavedPlace(): Place {
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    fun isPlaceSaved() = sharedPreferences().contains("place")

    private fun sharedPreferences() = StarJumpWeatherApplication.context.
    getSharedPreferences("sunny_weather", Context.MODE_PRIVATE)
}
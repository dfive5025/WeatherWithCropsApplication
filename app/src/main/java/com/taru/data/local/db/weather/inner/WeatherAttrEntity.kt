package com.taru.data.local.db.weather.inner

import com.squareup.moshi.Json


data class WeatherAttrEntity(
    var temp: Float?,
    val pressure: Int,
    val humidity: Int, var tempMin: Float, var tempMax: Float
) {
}
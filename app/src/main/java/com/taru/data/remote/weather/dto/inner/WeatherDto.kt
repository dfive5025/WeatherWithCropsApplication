package com.taru.data.remote.weather.dto.inner

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class WeatherDto(val id: Int, val main: String) {
}
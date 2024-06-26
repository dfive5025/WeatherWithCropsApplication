package com.taru.data.remote.weather.dto

import com.squareup.moshi.JsonClass
import com.taru.data.remote.weather.dto.inner.WeatherCityDto
import com.taru.data.remote.weather.dto.inner.WeatherForecastDayDto

@JsonClass(generateAdapter = true)
data class WeatherForecastDto(
//    val city: WeatherCityDto,
    val cnt: Int,
    val list: List<WeatherForecastDayDto>) {

}
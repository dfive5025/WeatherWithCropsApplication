package com.taru.data.remote.identify.dto

import com.squareup.moshi.JsonClass
import com.taru.data.remote.identify.dto.inner.PlantIdentifiedResult



@JsonClass(generateAdapter = true)
data class PlantIdentifyDto(val language: String,
val results:List<PlantIdentifiedResult>) {
}
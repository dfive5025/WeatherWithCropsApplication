package com.taru.data.remote.plants.dto

import com.squareup.moshi.JsonClass



@JsonClass(generateAdapter = true)
data class PlantDetailResponseDto(val data: PlantDetailDto) {
}
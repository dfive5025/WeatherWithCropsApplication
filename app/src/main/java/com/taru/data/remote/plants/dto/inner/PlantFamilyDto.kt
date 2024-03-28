package com.taru.data.remote.plants.dto.inner

import com.squareup.moshi.JsonClass
import retrofit2.http.Field



@JsonClass(generateAdapter = true)
data class PlantFamilyDto(var id: String,
                         var name: String

) {
}
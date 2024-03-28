package com.taru.data.local.db.weather

import androidx.room.*
import com.taru.data.local.db.weather.inner.WeatherAttrEntity
import com.taru.data.local.db.weather.inner.WeatherSubEntity



@Entity(
    tableName = "ForecastEntry",

    indices = [Index("forecastId"), Index("dt")],
    foreignKeys = [ForeignKey(
        onDelete = ForeignKey.CASCADE,
        entity = WeatherForecastRoomEntity::class,
        parentColumns = ["id"],
        childColumns = ["forecastId"]
    )]
)
data class ForecastEntryEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val forecastId: Int,
    val dt: Int,
    @Embedded(prefix = "weather_") val weather: WeatherSubEntity?,
    @Embedded(prefix = "attr_") val attrs: WeatherAttrEntity
) {
}
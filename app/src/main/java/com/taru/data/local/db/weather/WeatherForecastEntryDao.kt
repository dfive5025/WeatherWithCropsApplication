package com.taru.data.local.db.weather

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.taru.data.local.db.base.RoomDaoBase


@Dao
interface WeatherForecastEntryDao : RoomDaoBase<ForecastEntryEntity> {


}
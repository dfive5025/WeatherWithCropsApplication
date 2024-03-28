package com.taru.data.local.db.plant

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import com.taru.data.local.db.location.LocationRoomEntity
import retrofit2.http.Field


@Entity(tableName = "PlantImages",

    indices=[Index("plantId"), Index("key")],
    foreignKeys =
    [ForeignKey(
        onDelete = ForeignKey.CASCADE, entity = PlantEntity::class, parentColumns = ["id"],
        childColumns = ["plantId"],
    )])
data class PlantImageEntity(
    @PrimaryKey(autoGenerate = true)  val id:Int = 0,
    var imageId: Int,
    var plantId: Int,
    var key: String,
    var imageUrl: String
) {
}
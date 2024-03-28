package com.taru.data.local.db.plant

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Query
import com.taru.data.local.db.base.RoomDaoBase


@Dao
interface PlantImageDao: RoomDaoBase<PlantImageEntity> {

    @Query("DELETE FROM PlantImages")
    fun deleteAll()

}
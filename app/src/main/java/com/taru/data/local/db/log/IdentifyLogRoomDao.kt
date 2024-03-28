package com.taru.data.local.db.log

import androidx.room.Dao
import androidx.room.Query
import com.taru.data.local.db.base.RoomDaoBase


@Dao
interface IdentifyLogRoomDao: RoomDaoBase<IdentifyLogRoomEntity> {

    @Query("SELECT COUNT(id) FROM IdentifyLog where dt > :dt")
    suspend fun count(dt:Int): Int

}
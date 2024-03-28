package com.taru.data.remote.ip

import com.taru.data.remote.ip.dto.IpDto
import retrofit2.Response
import retrofit2.http.GET


interface ApiIp {

    @GET("json")
    suspend fun getIp(
    ): Response<IpDto>
}
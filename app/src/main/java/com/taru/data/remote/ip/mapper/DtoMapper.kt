package com.taru.data.remote.ip.mapper

import com.taru.data.remote.ip.dto.IpDto


fun IpDto.toLatLng(): Array<Float> {
    return arrayOf(lat, lon)
}
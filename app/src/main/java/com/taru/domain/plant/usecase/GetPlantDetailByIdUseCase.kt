package com.taru.domain.plant.usecase

import com.taru.data.local.db.plant.PlantDetailRoomData
import com.taru.domain.base.result.DomainResult
import com.taru.domain.plant.repository.PlantRepository
import javax.inject.Inject

class GetPlantDetailByIdUseCase @Inject constructor(private var plantRepository: PlantRepository)  {

    suspend operator fun invoke(plantId: Int): DomainResult<PlantDetailRoomData> = plantRepository.getPlantDetail(plantId)
}
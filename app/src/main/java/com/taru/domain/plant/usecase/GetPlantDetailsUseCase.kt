package com.taru.domain.plant.usecase

import com.taru.data.local.db.plant.PlantEntity
import com.taru.domain.base.result.DomainResult
import com.taru.domain.plant.repository.PlantRepository
import javax.inject.Inject

class GetPlantDetailsUseCase @Inject constructor(private var plantRepository: PlantRepository)  {

    suspend operator fun invoke(): DomainResult<List<PlantEntity>> = plantRepository.getRecentPlantList()
}
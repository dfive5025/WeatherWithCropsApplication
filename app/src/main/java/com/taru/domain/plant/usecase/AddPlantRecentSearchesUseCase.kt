package com.taru.domain.plant.usecase

import com.taru.data.local.db.plant.PlantRecentSearchEntity
import com.taru.domain.plant.repository.PlantRepository
import javax.inject.Inject

class AddPlantRecentSearchesUseCase @Inject constructor(private var plantRepository: PlantRepository)  {

    suspend operator fun invoke(recentSearch:List<PlantRecentSearchEntity> ) = plantRepository.addRecentSearches(recentSearch)
}
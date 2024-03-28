package com.taru.domain.weather.usecase

import com.taru.domain.base.result.DomainResult
import com.taru.domain.weather.repository.WeatherRepository
import javax.inject.Inject

class DeleteAllWeatherUseCase  @Inject constructor(private var weatherRepository: WeatherRepository)  {

    suspend operator fun invoke( ): DomainResult<Unit> = weatherRepository.clearData()
}
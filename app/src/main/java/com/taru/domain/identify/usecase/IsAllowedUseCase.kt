package com.taru.domain.identify.usecase

import com.taru.domain.base.result.DomainResult
import com.taru.domain.identify.repository.IdentifyRepository
import javax.inject.Inject

internal class IsAllowedUseCase  @Inject constructor(private var identifyRepository: IdentifyRepository)  {
    suspend operator fun invoke(): DomainResult<Boolean> = identifyRepository.isAllowed()
}
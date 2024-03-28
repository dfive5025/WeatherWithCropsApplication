package com.taru.domain.base.result

sealed interface DomainResult<out T> {
    data class Success<T>(val value: T) : DomainResult<T>
    data class Failure(val throwable: Throwable? = null) : DomainResult<Nothing>
}

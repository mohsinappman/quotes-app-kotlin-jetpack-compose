package com.example.kotlin_crash_course.domain.usecase

import com.example.kotlin_crash_course.domain.repository.QuoteRepository
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class RandomQuoteUseCase @Inject constructor(
    private val quoteRepository: QuoteRepository

) {
    suspend operator fun invoke() = flow {
        quoteRepository.getRandomQuote().let {
            if (it.isSuccessful) {
                emit(it.body())
            }
        }
    }
}
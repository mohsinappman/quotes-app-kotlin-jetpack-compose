package com.example.kotlin_crash_course.domain.usecase

import com.example.kotlin_crash_course.domain.repository.QuoteRepository
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class AllQuotesUseCase @Inject
constructor(
    private val quoteRepository: QuoteRepository
){
    operator fun invoke() = flow {
        quoteRepository.getAllQuotes().let {
            if(it.isSuccessful) {
                emit(it.body())
            }
        }
    }
}
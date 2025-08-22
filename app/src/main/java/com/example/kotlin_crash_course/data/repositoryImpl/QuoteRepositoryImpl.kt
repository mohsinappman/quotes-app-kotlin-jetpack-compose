package com.example.kotlin_crash_course.data.repositoryImpl

import com.example.kotlin_crash_course.data.models.AllQuotesDC
import com.example.kotlin_crash_course.data.remote.ApiInterface
import com.example.kotlin_crash_course.domain.entities.Quote
import com.example.kotlin_crash_course.domain.repository.QuoteRepository
import retrofit2.Response
import javax.inject.Inject

class QuoteRepositoryImpl @Inject constructor(
    private val apiInterface: ApiInterface
): QuoteRepository {

    override  suspend fun getAllQuotes(): Response<AllQuotesDC> {
        return apiInterface.getAllQuotes()
    }

    override  suspend fun getRandomQuote(): Response<Quote> {
        return  apiInterface.getRandomQuote()
    }
}
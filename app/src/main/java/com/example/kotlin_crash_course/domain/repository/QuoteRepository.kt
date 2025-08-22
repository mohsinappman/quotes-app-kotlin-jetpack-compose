package com.example.kotlin_crash_course.domain.repository

import com.example.kotlin_crash_course.data.models.AllQuotesDC
import com.example.kotlin_crash_course.domain.entities.Quote
import retrofit2.Response

interface QuoteRepository {

    suspend fun getAllQuotes() : Response<AllQuotesDC>

    suspend fun getRandomQuote() : Response<Quote>
}
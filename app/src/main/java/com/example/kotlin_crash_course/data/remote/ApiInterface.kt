package com.example.kotlin_crash_course.data.remote

import com.example.kotlin_crash_course.data.models.AllQuotesDC
import com.example.kotlin_crash_course.domain.entities.Quote
import com.example.kotlin_crash_course.network.ALL_QUOTES
import com.example.kotlin_crash_course.network.RANDOM_QUOTE
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET(ALL_QUOTES)
    suspend fun getAllQuotes(): Response<AllQuotesDC>

    @GET(RANDOM_QUOTE)
    suspend fun getRandomQuote(): Response<Quote>
}
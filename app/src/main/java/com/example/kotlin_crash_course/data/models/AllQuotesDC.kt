package com.example.kotlin_crash_course.data.models

import com.example.kotlin_crash_course.domain.entities.Quote
import com.google.gson.annotations.SerializedName

data class AllQuotesDC(
    @SerializedName("quotes")
    val quotes: List<Quote>
)
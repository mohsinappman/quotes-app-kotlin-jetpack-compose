package com.example.kotlin_crash_course.presentation.screens.homeScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlin_crash_course.common.AppState
import com.example.kotlin_crash_course.data.models.AllQuotesDC
import com.example.kotlin_crash_course.domain.entities.Quote
import com.example.kotlin_crash_course.domain.usecase.AllQuotesUseCase
import com.example.kotlin_crash_course.domain.usecase.RandomQuoteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeVM @Inject constructor(
    private val allQuotesUseCase: AllQuotesUseCase,
    private val randomQuoteUseCase: RandomQuoteUseCase
) : ViewModel() {

    private val _quotesData = MutableStateFlow<AppState<AllQuotesDC>>(AppState.LOADING())
    val quotesData: StateFlow<AppState<AllQuotesDC>> = _quotesData.asStateFlow() // Expose as StateFlow

    private val _randomQuoteData = MutableStateFlow<AppState<Quote>>(AppState.LOADING())
    val randomQuoteData: StateFlow<AppState<Quote>> = _randomQuoteData.asStateFlow()


    init {
        getQuotes()
        getRandomQuote()

    }

    fun getQuotes() {
        viewModelScope.launch {
            allQuotesUseCase()
                .onStart {
                    println("Loading state")
                    _quotesData.value = AppState.LOADING()
                }
                .catch { e ->
                    println("Exception $e")
                    _quotesData.value = AppState.ERROR(e.message ?: "An unexpected error occurred")
                }
                .collect { quotesList ->
                    if (quotesList != null) {
                        _quotesData.value = AppState.SUCCESS<AllQuotesDC>(quotesList)
                    } else {
                        _quotesData.value = AppState.ERROR("Failed to load quotes or no quotes available")
                    }
                }
        }
    }

    fun getRandomQuote() {
        viewModelScope.launch {
            randomQuoteUseCase()
                .onStart {
                    _randomQuoteData.value = AppState.LOADING()
                }
                .catch { e ->
                    _randomQuoteData.value = AppState.ERROR(e.message ?: "An unexpected error occurred for random quote")
                }
                .collect { randomQuote ->
                    if (randomQuote != null) {
                        _randomQuoteData.value = AppState.SUCCESS<Quote>(randomQuote)
                    } else {
                        _randomQuoteData.value = AppState.ERROR("Failed to load a random quote or no quote available")
                    }
                }
        }
    }

}

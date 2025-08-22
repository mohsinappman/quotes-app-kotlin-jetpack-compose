package com.example.kotlin_crash_course.presentation.screens.homeScreen.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.kotlin_crash_course.common.AppState
import com.example.kotlin_crash_course.data.models.AllQuotesDC
import com.example.kotlin_crash_course.domain.entities.Quote
import com.example.kotlin_crash_course.presentation.components.AppProgressBar
import com.example.kotlin_crash_course.presentation.screens.homeScreen.HomeVM

@Composable
fun HomeBody(
    allQuotesDC: AllQuotesDC? = null,
    onClick: () -> Unit,
    homeVM: HomeVM = hiltViewModel(),
) {
    val state = homeVM.randomQuoteData.collectAsStateWithLifecycle().value

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        item {
            HeadingTitle(title = "Random Quote")
            when(state) {
                is AppState.LOADING<*> -> {
                    AppProgressBar()
                }
                is AppState.SUCCESS<Quote> -> {
                    RandomQuoteItem(
                        modifier = Modifier.clickable{onClick()},
                        quote = state.data
                    )
                }
                else -> Unit

            }
        }

        item {
            HeadingTitle(title = "Quotes")
        }

        items(allQuotesDC?.quotes?.size ?: 0) {
            QuoteItem(
                modifier = Modifier.clickable{onClick()},
                quote = allQuotesDC?.quotes?.get(it)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeBodyPreview() {
    HomeBody(onClick = {})
}
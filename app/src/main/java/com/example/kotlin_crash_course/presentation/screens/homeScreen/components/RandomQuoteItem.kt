package com.example.kotlin_crash_course.presentation.screens.homeScreen.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotlin_crash_course.domain.entities.Quote

@Composable
fun RandomQuoteItem(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    quote: Quote? = null,
) {
    QuoteItem(
        color = Color.Red,
        textColor = Color.White,
        modifier = modifier,
        quote = quote
    )
}

@Composable
@Preview
private fun PreviewRandomQuoteItem() {
    RandomQuoteItem()
}
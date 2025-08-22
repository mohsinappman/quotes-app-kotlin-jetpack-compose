package com.example.kotlin_crash_course.presentation.screens.homeScreen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlin_crash_course.domain.entities.Quote

@Composable
fun QuoteItem(
    color: Color = Color.White,
    textColor: Color = Color.Black,
    modifier: Modifier = Modifier,
    quote: Quote? = null
) {
    Card(
        elevation = CardDefaults.cardElevation(10.dp),
        colors = CardDefaults.cardColors(containerColor = color),
        modifier = modifier
        .fillMaxWidth()
        .padding(8.dp),
        ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
        ) {
            Text(
                text = quote?.quote ?: "No quote available",
                modifier = Modifier.fillMaxWidth(),
                color = textColor,
                textAlign = TextAlign.Justify,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Text(
                text = quote?.author ?: "No author available",
                modifier = Modifier.fillMaxWidth(),
                color = textColor,
                textAlign = TextAlign.End,
                fontSize = 12.sp,
                fontWeight = FontWeight.W300,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun QuoteItemPreview() {
    QuoteItem()
}

@Preview(showBackground = true)
@Composable
private fun RandomQuoteItemPreview() {
    QuoteItem()
}
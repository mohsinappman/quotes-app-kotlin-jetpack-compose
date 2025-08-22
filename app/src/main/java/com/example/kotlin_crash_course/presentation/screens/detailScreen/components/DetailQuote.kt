package com.example.kotlin_crash_course.presentation.screens.detailScreen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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

@Composable
fun DetailQuote() {
    Card(
        elevation = CardDefaults.cardElevation(10.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .padding(15.dp),
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
        ){
            Text(
                text = "This is a very dumb quote",
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                color = Color.Black,
                maxLines = 3,
                fontWeight = FontWeight.W800,
                textAlign = TextAlign.Justify,
                fontSize = 16.sp,
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Text(
                text = "This is a quote",
                modifier = Modifier.fillMaxWidth(),
                color = Color.Black,
                maxLines = 3,
                fontWeight = FontWeight.W300,
                textAlign = TextAlign.End,
                fontSize = 12.sp,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewDetailQuote() {
    DetailQuote()
}
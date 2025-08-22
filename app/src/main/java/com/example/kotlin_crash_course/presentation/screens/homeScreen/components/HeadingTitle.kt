package com.example.kotlin_crash_course.presentation.screens.homeScreen.components

import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HeadingTitle(
    title: String
) {
    Text(
        text = title,
        color = Color.Black,
        fontWeight = FontWeight.W800,
        fontSize = 16.sp,
        fontStyle = FontStyle.Italic,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp)
    )
}

@Preview(showBackground = true)
@Composable
private fun HeadingTitlePreview() {
    HeadingTitle(title = "Random Quotes")
}
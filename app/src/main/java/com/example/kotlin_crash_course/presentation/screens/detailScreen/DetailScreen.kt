package com.example.kotlin_crash_course.presentation.screens.detailScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotlin_crash_course.presentation.components.ToolBarComponent
import com.example.kotlin_crash_course.presentation.screens.detailScreen.components.DetailQuote

@Composable
fun DetailScreen(
    onBackPress: () -> Unit
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            ToolBarComponent(
                title = "Quote Detail",
                showBackButton = true,
                onBackPress = onBackPress
            )
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray)
                .padding(paddingValues),
            contentAlignment = Alignment.Center
        ) {
            DetailQuote()
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun DetailScreenPreview() {
    DetailScreen{}
}
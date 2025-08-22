package com.example.kotlin_crash_course.presentation.screens.homeScreen

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.kotlin_crash_course.common.AppState
import com.example.kotlin_crash_course.data.models.AllQuotesDC
import com.example.kotlin_crash_course.presentation.components.AppProgressBar
import com.example.kotlin_crash_course.presentation.components.ToolBarComponent
import com.example.kotlin_crash_course.presentation.screens.homeScreen.components.HomeBody

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    homeVM: HomeVM = hiltViewModel(),
    onClick: () -> Unit
) {

    val state = homeVM.quotesData.collectAsStateWithLifecycle().value

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            ToolBarComponent(title = "Home", showBackButton = false)
        }
    ) { paddingValue ->
        Box(
            modifier = Modifier
                .padding(paddingValue)
                .fillMaxSize()
                .background(Color.White),
            contentAlignment = Alignment.Center
        ) {
            when(state) {
                is AppState.LOADING<*> -> {
                    AppProgressBar()
                }
                is AppState.SUCCESS<AllQuotesDC> -> {
                    HomeBody(
                        onClick = onClick,
                        allQuotesDC = state.data
                    )
                }
                 else -> Unit
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen{}
}
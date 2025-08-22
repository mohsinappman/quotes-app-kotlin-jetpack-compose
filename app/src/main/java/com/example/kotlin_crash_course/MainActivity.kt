package com.example.kotlin_crash_course

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.kotlin_crash_course.presentation.navigation.AppNavController
import com.example.kotlin_crash_course.presentation.ui.theme.KotlincrashcourseTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlincrashcourseTheme {
                AppNavController()
            }
        }
    }
}
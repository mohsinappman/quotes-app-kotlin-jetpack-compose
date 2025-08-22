package com.example.kotlin_crash_course.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kotlin_crash_course.presentation.screens.detailScreen.DetailScreen
import com.example.kotlin_crash_course.presentation.screens.homeScreen.HomeScreen

@Composable
fun AppNavController() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = ScreenNames.HOME_SCREEN) {

        composable(route = ScreenNames.HOME_SCREEN) {
            HomeScreen{
                navController.navigate(ScreenNames.DETAIL_SCREEN)
            }
        }

        composable(route = ScreenNames.DETAIL_SCREEN) {
            DetailScreen{
                navController.popBackStack()
            }
        }
    }
}
package com.example.kotlin_crash_course.common


sealed class AppState<T> {
    class LOADING<T>(): AppState<T>()
    data class SUCCESS<T>(val data: T): AppState<T>()
    data class ERROR<T>(val error: Any): AppState<T>()
}
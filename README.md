# Quotes App Kotlin Jetpack Compose

This is a simple Quotes App built using Kotlin and Jetpack Compose. The app demonstrates modern Android development practices including MVVM architecture, Hilt for dependency injection, and Jetpack Compose for UI.

## Features
- Display random quotes
- Home screen with list of quotes
- MVVM architecture
- Hilt dependency injection
- Jetpack Compose UI

## Getting Started

### Prerequisites
- Android Studio (Arctic Fox or newer)
- Kotlin 1.5+
- Gradle 7+

### How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/mohsinappman/quotes-app-kotlin-jetpack-compose.git
   ```
2. Open the project in Android Studio.
3. Build and run the app on an emulator or physical device.

## Project Structure
- `app/src/main/java/com/example/kotlin_crash_course/` - Main source code
- `app/src/main/res/` - Resources (layouts, drawables, etc.)
- `build.gradle.kts` - Project build configuration

## Folder Structure Skeleton
```
Kotlincrashcourse/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/kotlin_crash_course/
│   │   │   │   ├── presentation/
│   │   │   │   │   └── screens/
│   │   │   │   │       └── homeScreen/
│   │   │   │   ├── data/
│   │   │   │   └── domain/
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   ├── drawable/
│   │   │   │   └── values/
│   │   ├── test/
│   │   └── androidTest/
│   ├── build.gradle.kts
│   └── proguard-rules.pro
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
├── gradle/
│   └── wrapper/
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
└── README.md
```

## Libraries Used
- Jetpack Compose
- Hilt
- Hilt Navigation
- Kotlin Coroutines
- Retrofit

## License
This project is licensed under the MIT License.

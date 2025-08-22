package com.example.kotlin_crash_course.di

import com.example.kotlin_crash_course.data.remote.ApiInterface
import com.example.kotlin_crash_course.data.repositoryImpl.QuoteRepositoryImpl
import com.example.kotlin_crash_course.domain.repository.QuoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent:: class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideQuoteRepository(apiInterface: ApiInterface): QuoteRepository {
        return QuoteRepositoryImpl(apiInterface)
    }

}
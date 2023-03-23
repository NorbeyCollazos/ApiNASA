package com.ncrdesarrollo.apinasa.di

import com.ncrdesarrollo.apinasa.NasaApiClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    val key = "Q86mPnqHqlrDht5RBQAOVRwAXCY5ZfNl63cPnhJU"

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.nasa.gov/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideNasaApiClient(retrofit: Retrofit): NasaApiClient {
        return retrofit.create(NasaApiClient::class.java)
    }
}

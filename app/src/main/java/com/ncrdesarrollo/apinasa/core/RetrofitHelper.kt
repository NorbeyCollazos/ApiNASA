package com.ncrdesarrollo.apinasa.core

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    val api = "Q86mPnqHqlrDht5RBQAOVRwAXCY5ZfNl63cPnhJU"
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.nasa.gov/")
            .addConverterFactory(GsonConverterFactory.create())
            //.client(getClient())
            .build()
    }

    private fun getClient(): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(HeaderInterceptor())
            .build()
}

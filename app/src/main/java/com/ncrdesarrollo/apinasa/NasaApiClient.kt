package com.ncrdesarrollo.apinasa

import com.ncrdesarrollo.apinasa.apodo.util.ApodoModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NasaApiClient {

    @GET("planetary/apod")
    suspend fun getApodo(@Query("api_key") api_key: String): Response<ApodoModel>
}

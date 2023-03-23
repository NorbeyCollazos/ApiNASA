package com.ncrdesarrollo.apinasa.apodo.data

import com.ncrdesarrollo.apinasa.NasaApiClient
import com.ncrdesarrollo.apinasa.apodo.util.ApodoModel
import com.ncrdesarrollo.apinasa.di.NetworkModule
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ApodoDataSource @Inject constructor(private val api: NasaApiClient) {

    suspend fun getApodo(): ApodoModel? {
        return withContext(Dispatchers.IO) {
            val response = api.getApodo(NetworkModule.key)
            response.body() ?: null
        }
    }
}

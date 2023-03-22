package com.ncrdesarrollo.apinasa.apodo.data

import com.ncrdesarrollo.apinasa.NasaApiClient
import com.ncrdesarrollo.apinasa.core.RetrofitHelper
import com.ncrdesarrollo.apinasa.apodo.util.ApodoModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ApodoDataSource {

    val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getApodo(): ApodoModel? {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(NasaApiClient::class.java).getApodo(RetrofitHelper.api)
            response.body() ?: null
        }
    }
}
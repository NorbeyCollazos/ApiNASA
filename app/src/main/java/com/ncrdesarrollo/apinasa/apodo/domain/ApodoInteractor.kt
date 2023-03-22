package com.ncrdesarrollo.apinasa.apodo.domain

import com.ncrdesarrollo.apinasa.apodo.data.ApodoRepository
import com.ncrdesarrollo.apinasa.apodo.util.ApodoModel

class ApodoInteractor {

    private val respository = ApodoRepository()

    suspend fun getApodo(): ApodoModel? {
        return respository.getApodo()
    }
}

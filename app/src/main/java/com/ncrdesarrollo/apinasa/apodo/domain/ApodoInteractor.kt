package com.ncrdesarrollo.apinasa.apodo.domain

import com.ncrdesarrollo.apinasa.apodo.data.ApodoRepository
import com.ncrdesarrollo.apinasa.apodo.util.ApodoModel
import javax.inject.Inject

class ApodoInteractor @Inject constructor(
    private val repository: ApodoRepository
) {

    suspend fun getApodo(): ApodoModel? {
        return repository.getApodo()
    }
}

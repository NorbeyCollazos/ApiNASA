package com.ncrdesarrollo.apinasa.apodo.data

import android.util.Log
import com.ncrdesarrollo.apinasa.apodo.util.ApodoModel
import javax.inject.Inject

class ApodoRepository @Inject constructor(
    private val dataSource: ApodoDataSource
) {

    suspend fun getApodo(): ApodoModel? {
        return dataSource.getApodo().also { Log.d("Response", "$it") }
    }
}

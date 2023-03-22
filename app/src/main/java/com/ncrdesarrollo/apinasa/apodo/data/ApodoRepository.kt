package com.ncrdesarrollo.apinasa.apodo.data

import android.util.Log
import com.ncrdesarrollo.apinasa.apodo.util.ApodoModel

class ApodoRepository {

    private val dataSource = ApodoDataSource()

    suspend fun getApodo(): ApodoModel? {
        return dataSource.getApodo().also { Log.d("Response", "$it") }
    }
}

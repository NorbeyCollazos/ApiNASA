package com.ncrdesarrollo.apinasa.core

import okhttp3.Interceptor
import okhttp3.Response

class HeaderInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
            .addHeader("api_key", "Q86mPnqHqlrDht5RBQAOVRwAXCY5ZfNl63cPnhJU")
            .build()
        return chain.proceed(request)
    }
}

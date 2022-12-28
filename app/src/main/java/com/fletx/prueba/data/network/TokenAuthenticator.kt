package com.fletx.pruebA.data.network

import okhttp3.Interceptor

class TokenAuthenticator(private val tokenType: String, private val accessToken: String) :
    Interceptor {
    override fun intercept(chain: Interceptor.Chain): okhttp3.Response {
        var request = chain.request()
        request = request.newBuilder().header("Authorization", "$tokenType $accessToken").build()
        return chain.proceed(request)
    }
}
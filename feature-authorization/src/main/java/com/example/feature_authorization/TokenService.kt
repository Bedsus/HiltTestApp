package com.example.feature_authorization

import retrofit2.http.GET

interface TokenService {

    @GET("clients")
    suspend fun getToken(): Token
}
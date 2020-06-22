package com.example.hilttextapp.network

import com.example.hilttextapp.repo.NetworkClient
import retrofit2.http.GET

interface ClientService {

    @GET("clients")
    suspend fun getClientList(): List<NetworkClient>
}
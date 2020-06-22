package com.example.feature_authorization

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import retrofit2.Retrofit

class SecondViewModel @ViewModelInject constructor(
    retrofit: Retrofit,
    val token: Token
) : ViewModel() {

    private val service = retrofit.create(TokenService::class.java)

}
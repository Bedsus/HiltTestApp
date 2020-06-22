package com.example.hilttextapp

import android.content.Context
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.hilttextapp.network.ResultRequest
import com.example.hilttextapp.repo.Client
import com.example.hilttextapp.repo.ClientRepository
import dagger.hilt.android.qualifiers.ActivityContext

class MainViewModel @ViewModelInject constructor(
        @ActivityContext private val context : Context,
        repo: ClientRepository
) : ViewModel() {

    val clientList: LiveData<ResultRequest<List<Client>>> = repo.getResultClientList()
}
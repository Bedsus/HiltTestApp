package com.example.hilttextapp.repo

import com.google.gson.annotations.SerializedName

class NetworkClient (
    @SerializedName("id") val id: Int?,
    @SerializedName("name") val name: String?
)

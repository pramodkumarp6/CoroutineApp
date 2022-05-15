package com.example.coroutineapp.model

import com.google.gson.annotations.SerializedName

data class RegisterResponse (
    @SerializedName("error")
    val error: Boolean,
    @SerializedName("message")
    val massage: String
        )
package com.example.coroutineapp.model


import com.google.gson.annotations.SerializedName

data class UserResponse(
    @SerializedName("error")
    val error: Boolean,
    @SerializedName("users")
    val users: List<User>
)
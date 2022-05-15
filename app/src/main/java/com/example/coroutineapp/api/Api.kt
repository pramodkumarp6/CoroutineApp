package com.example.coroutineapp.api

import com.example.coroutineapp.model.RegisterResponse
import com.example.coroutineapp.model.UserResponse
import retrofit2.http.Field
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.Response

interface Api{
    suspend fun createUser(
        @Field("email") email: String, @Field("password") password: String,
        @Field("name") name: String, @Field("school") school: String
    ): Response<RegisterResponse>




        @GET("/simple/public/allusers")
        @Headers("Content-type:application/json")
        suspend fun getUser(): Response<UserResponse>

    }

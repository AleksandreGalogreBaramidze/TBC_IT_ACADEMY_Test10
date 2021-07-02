package com.example.testapi.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstant {

    val Instance: RetrofitResponse by lazy {
        Retrofit.Builder()
            .baseUrl("https://run.mocky.io")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RetrofitResponse::class.java)
    }
}
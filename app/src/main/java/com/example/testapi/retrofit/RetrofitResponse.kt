package com.example.testapi.retrofit

import com.example.testapi.models.Titles
import retrofit2.Response
import retrofit2.http.GET

interface RetrofitResponse {
    @GET("/v3/29db8caa-95cb-44be-aa3c-eee0aa406870")
    suspend fun getResponse(): Response<List<Titles>>
}
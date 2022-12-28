package com.example.demo.network

import com.example.demo.models.ParahDetailResponse
import retrofit2.http.GET

interface ApiService2 {



    @GET("surah")
    suspend fun getAllParaInfo(): ParahDetailResponse


}
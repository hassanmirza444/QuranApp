package com.example.demo.network

import com.example.demo.models.ParahDetailResponse
import com.example.demo.models.RecitorsResponse
import com.example.demo.models.SurahDetailResponse
import com.example.demo.models.SurahInfoResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("surah")
    suspend fun getAllSurahInfo(): SurahInfoResponse

    @GET("juz/{id}/{edi}")
    suspend fun getParaInfo(@Path("id") id: Int, @Path("edi") edition: String): ParahDetailResponse

    @GET("surah/{id}/editions/{ar}")
    suspend fun getSurahDetail(@Path("id") id: Int, @Path("ar") arabic: String): SurahDetailResponse


    @GET("edition/type/{type}")
    suspend fun getAllRecitorsListofGivenType(@Path("type") type: String): RecitorsResponse

}
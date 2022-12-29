package com.example.demo.network


import com.example.demo.models.ParahDetailResponse
import com.example.demo.models.RecitorsResponse
import com.example.demo.models.SurahDetailResponse
import com.example.demo.models.SurahInfoResponse
import javax.inject.Inject

class ApiServiceImpl @Inject constructor(
    private val apiService: ApiService,
    private val apiService2: ApiService2
) {

    suspend fun getAllSurahInfoList(): SurahInfoResponse = apiService.getAllSurahInfo()
    suspend fun getAllParaInfoList(): ParahDetailResponse = apiService2.getAllParaInfo()
    suspend fun getAllRecitorsListofGivenType(type: String): RecitorsResponse =
        apiService.getAllRecitorsListofGivenType(type)

    suspend fun getSurahDetail(id: Int, edition: String): SurahDetailResponse =
        apiService.getSurahDetail(id, edition)

    suspend fun getParahDetail(id: Int, edition: String): ParahDetailResponse =
        apiService.getParaInfo(id,edition)
}
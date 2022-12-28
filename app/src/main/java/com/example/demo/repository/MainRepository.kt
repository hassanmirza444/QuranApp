package com.example.demo.repository

import com.example.demo.models.*
import com.example.demo.network.ApiServiceImpl
import com.google.gson.JsonObject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class MainRepository
@Inject
constructor(private val apiServiceImpl: ApiServiceImpl) {

    fun getAllSurahInfo(mHashMap: HashMap<String, Any>): Flow<SurahInfoResponse> = flow {
        emit(apiServiceImpl.getAllSurahInfoList())
    }.flowOn(Dispatchers.IO)

    fun getAllParaInfoList(mHashMap: HashMap<String, Any>): Flow<ParahDetailResponse> = flow {
        emit(apiServiceImpl.getAllParaInfoList())
    }.flowOn(Dispatchers.IO)

    fun getSurahDetailData(id: Int,edition: String): Flow<SurahDetailResponse> = flow {
        emit(apiServiceImpl.getSurahDetail(id,edition))
    }.flowOn(Dispatchers.IO)

    fun getParahDetailData(id: Int,edition: String): Flow<ParahDetailResponse> = flow {
        emit(apiServiceImpl.getParahDetail(id,edition))
    }.flowOn(Dispatchers.IO)

    fun getAllRecitorsListofGivenType(type : String): Flow<RecitorsResponse> = flow {
        emit(apiServiceImpl.getAllRecitorsListofGivenType(type))
    }.flowOn(Dispatchers.IO)




}


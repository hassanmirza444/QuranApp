package com.example.demo.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J0\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\"\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001`\u000bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000e\u001a\u00020\nJ0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\"\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001`\u000bJ\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nJ\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/demo/repository/MainRepository;", "", "apiServiceImpl", "Lcom/example/demo/network/ApiServiceImpl;", "(Lcom/example/demo/network/ApiServiceImpl;)V", "getAllParaInfoList", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/demo/models/ParahDetailResponse;", "mHashMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getAllRecitorsListofGivenType", "Lcom/example/demo/models/RecitorsResponse;", "type", "getAllSurahInfo", "Lcom/example/demo/models/SurahInfoResponse;", "getParahDetailData", "id", "", "edition", "getSurahDetailData", "Lcom/example/demo/models/SurahDetailResponse;", "app_debug"})
public final class MainRepository {
    private final com.example.demo.network.ApiServiceImpl apiServiceImpl = null;
    
    @javax.inject.Inject()
    public MainRepository(@org.jetbrains.annotations.NotNull()
    com.example.demo.network.ApiServiceImpl apiServiceImpl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.demo.models.SurahInfoResponse> getAllSurahInfo(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.Object> mHashMap) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.demo.models.ParahDetailResponse> getAllParaInfoList(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.Object> mHashMap) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.demo.models.SurahDetailResponse> getSurahDetailData(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String edition) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.demo.models.ParahDetailResponse> getParahDetailData(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String edition) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.demo.models.RecitorsResponse> getAllRecitorsListofGivenType(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        return null;
    }
}
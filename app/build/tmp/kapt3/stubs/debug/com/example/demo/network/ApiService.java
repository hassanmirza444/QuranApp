package com.example.demo.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ%\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ%\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0012\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/example/demo/network/ApiService;", "", "getAllRecitorsListofGivenType", "Lcom/example/demo/models/RecitorsResponse;", "type", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllSurahInfo", "Lcom/example/demo/models/SurahInfoResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getParaInfo", "Lcom/example/demo/models/ParahDetailResponse;", "id", "", "edition", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSurahDetail", "Lcom/example/demo/models/SurahDetailResponse;", "arabic", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "surah")
    public abstract java.lang.Object getAllSurahInfo(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.demo.models.SurahInfoResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "juz/{id}/{edi}")
    public abstract java.lang.Object getParaInfo(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "edi")
    java.lang.String edition, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.demo.models.ParahDetailResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "surah/{id}/editions/{ar}")
    public abstract java.lang.Object getSurahDetail(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "ar")
    java.lang.String arabic, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.demo.models.SurahDetailResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "edition/type/{type}")
    public abstract java.lang.Object getAllRecitorsListofGivenType(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "type")
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.demo.models.RecitorsResponse> continuation);
}
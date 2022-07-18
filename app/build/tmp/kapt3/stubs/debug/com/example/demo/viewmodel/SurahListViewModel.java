package com.example.demo.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J*\u0010\n\u001a\u00020\u000b2\"\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f`\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0011"}, d2 = {"Lcom/example/demo/viewmodel/SurahListViewModel;", "Landroidx/lifecycle/ViewModel;", "mainRepository", "Lcom/example/demo/repository/MainRepository;", "(Lcom/example/demo/repository/MainRepository;)V", "postStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/demo/util/ApiState;", "getPostStateFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getAllSurahList", "Lkotlinx/coroutines/Job;", "mHashMap", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "app_debug"})
public final class SurahListViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.demo.repository.MainRepository mainRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.demo.util.ApiState> postStateFlow = null;
    
    @javax.inject.Inject()
    public SurahListViewModel(@org.jetbrains.annotations.NotNull()
    com.example.demo.repository.MainRepository mainRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<com.example.demo.util.ApiState> getPostStateFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getAllSurahList(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.Object> mHashMap) {
        return null;
    }
}
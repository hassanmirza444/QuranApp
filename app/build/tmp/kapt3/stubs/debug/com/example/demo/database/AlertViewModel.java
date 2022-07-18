package com.example.demo.database;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eR\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/demo/database/AlertViewModel;", "Landroidx/lifecycle/ViewModel;", "surahRepository", "Lcom/example/demo/database/SurahRepository;", "paraRepository", "Lcom/example/demo/database/ParaRepository;", "(Lcom/example/demo/database/SurahRepository;Lcom/example/demo/database/ParaRepository;)V", "getParaList", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/demo/models/ParaInfo;", "getGetParaList", "()Landroidx/lifecycle/LiveData;", "getSurahList", "Lcom/example/demo/models/SurahInfo;", "getGetSurahList", "delete", "", "user", "insert", "para", "app_debug"})
public final class AlertViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.demo.database.SurahRepository surahRepository = null;
    private final com.example.demo.database.ParaRepository paraRepository = null;
    
    @javax.inject.Inject()
    public AlertViewModel(@org.jetbrains.annotations.NotNull()
    com.example.demo.database.SurahRepository surahRepository, @org.jetbrains.annotations.NotNull()
    com.example.demo.database.ParaRepository paraRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.demo.models.SurahInfo>> getGetSurahList() {
        return null;
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.example.demo.models.SurahInfo user) {
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull()
    com.example.demo.models.SurahInfo user) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.demo.models.ParaInfo>> getGetParaList() {
        return null;
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.example.demo.models.ParaInfo para) {
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull()
    com.example.demo.models.ParaInfo user) {
    }
}
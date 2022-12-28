package com.example.demo.database;

import java.lang.System;

@androidx.room.Database(entities = {com.example.demo.models.SurahInfo.class, com.example.demo.models.ParaInfo.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/demo/database/QuranDatabase;", "Landroidx/room/RoomDatabase;", "()V", "paraDao", "Lcom/example/demo/database/ParaDao;", "surahDao", "Lcom/example/demo/database/SurahDao;", "app_debug"})
public abstract class QuranDatabase extends androidx.room.RoomDatabase {
    
    public QuranDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.demo.database.SurahDao surahDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.demo.database.ParaDao paraDao();
}
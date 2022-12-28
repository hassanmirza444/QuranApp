package com.example.demo.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.demo.models.ParaInfo
import com.example.demo.models.SurahInfo

@Database(entities = [SurahInfo::class,ParaInfo::class], version = 1, exportSchema = false)
abstract class QuranDatabase : RoomDatabase(){
    abstract fun surahDao():SurahDao
    abstract fun paraDao():ParaDao

}
package com.example.demo.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.demo.models.SurahInfo
import kotlinx.coroutines.flow.Flow

@Dao
interface SurahDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(user:SurahInfo)

    @Query("SELECT * FROM SurahInfo")
    fun getList(): Flow<List<SurahInfo>>

    @Query("SELECT * FROM SurahInfo")
    fun getAllSurah(): LiveData<List<SurahInfo>>

    @Delete
    fun delete(alert: SurahInfo)
}
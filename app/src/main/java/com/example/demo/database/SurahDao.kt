package com.example.demo.database

import androidx.room.*
import com.example.demo.models.SurahInfo
import kotlinx.coroutines.flow.Flow

@Dao
interface SurahDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(user:SurahInfo)

    @Query("SELECT * FROM SurahInfo")
    fun getList(): Flow<List<SurahInfo>>

    @Delete
    fun delete(alert: SurahInfo)
}
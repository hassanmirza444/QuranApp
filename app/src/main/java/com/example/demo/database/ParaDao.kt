package com.example.demo.database

import androidx.room.*
import com.example.demo.models.ParaInfo
import kotlinx.coroutines.flow.Flow

@Dao
interface ParaDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(user: ParaInfo)

    @Query("SELECT * FROM ParaInfo")
    fun getList(): Flow<List<ParaInfo>>

    @Delete
    fun delete(alert: ParaInfo)
}
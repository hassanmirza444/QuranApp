package com.example.demo.database


import androidx.annotation.WorkerThread
import com.example.demo.models.SurahInfo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext
import javax.inject.Inject

class SurahRepository @Inject constructor (private val surahDao: SurahDao) {
    val getList:Flow<List<SurahInfo>> = surahDao.getList()

    @WorkerThread
    suspend fun insert(alert:SurahInfo) = withContext(Dispatchers.IO){
        surahDao.insert(alert)
    }

    @WorkerThread
    suspend fun delete(alert:SurahInfo) = withContext(Dispatchers.IO){
        surahDao.delete(alert)
    }
}
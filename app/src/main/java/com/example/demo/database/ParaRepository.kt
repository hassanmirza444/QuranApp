package com.example.demo.database


import androidx.annotation.WorkerThread
import com.example.demo.models.ParaInfo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ParaRepository @Inject constructor(private val paraDao: ParaDao) {
    val getList: Flow<List<ParaInfo>> = paraDao.getList()

    @WorkerThread
    suspend fun insert(alert: ParaInfo) = withContext(Dispatchers.IO) {
        paraDao.insert(alert)
    }

    @WorkerThread
    suspend fun delete(alert: ParaInfo) = withContext(Dispatchers.IO) {
        paraDao.delete(alert)
    }
}
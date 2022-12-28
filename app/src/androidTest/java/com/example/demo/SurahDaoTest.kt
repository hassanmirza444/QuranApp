package com.example.demo

import android.util.Log
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.asLiveData
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import com.example.demo.database.QuranDatabase
import com.example.demo.database.SurahDao
import com.example.demo.models.SurahInfo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import okhttp3.internal.wait
import org.junit.*
import java.util.logging.Logger

class SurahDaoTest {

    lateinit var quranDatabase: QuranDatabase
    lateinit var surahDao: SurahDao

    //A JUnit Test Rule that swaps the background executor used by the Architecture Components
    //with a different one which executes each task synchronously.
    @get:Rule
    var instantExecutorRule = InstantTaskExecutorRule()

    @Before
    fun setup() {

        quranDatabase = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            QuranDatabase::class.java
        ).allowMainThreadQueries().build()
        surahDao = quranDatabase.surahDao()

    }

    @Test
    fun insertSurah_Correct() = runBlocking {
        val surahInfo = SurahInfo(1, "abc", "def", "ghi", "jkl", 10)
        surahDao.insert(surahInfo)
        val result = surahDao.getAllSurah().getOrAwaitValue()
        Assert.assertEquals("abc", result.get(0).name)

    }


    @Test
    fun deleteSurah_Correct() = runBlocking {
        val surahInfo = SurahInfo(1, "abc", "def", "ghi", "jkl", 10)
        surahDao.insert(surahInfo)
        surahDao.delete(surahInfo)
        val result = surahDao.getAllSurah().getOrAwaitValue()
        Assert.assertEquals(0, result.size)

    }


    @After
    fun tearDown() {
        quranDatabase.close()

    }


}
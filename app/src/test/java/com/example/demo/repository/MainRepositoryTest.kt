package com.example.demo.repository

import android.content.Context
import android.content.res.AssetManager
import android.util.Log
import com.example.demo.models.SurahDetailResponse
import com.google.gson.Gson
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import org.json.JSONException
import org.json.JSONObject
import org.junit.After
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.ArgumentMatchers.anyString
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import org.mockito.kotlin.doReturn
import java.io.IOException
import java.io.InputStream


class MainRepositoryTest {

    @Mock
    lateinit var mainRepository: MainRepository

    @Mock
    lateinit var surahDetailResponse: SurahDetailResponse

    @Mock
    lateinit var context: Context

    @Mock
    lateinit var assetManager: AssetManager

    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)
    }


    @Test
    fun test_withJsonInAssets_correct(){
        val testStream = MainRepository::class.java.getResourceAsStream("/surah_detail.json")
        doReturn(assetManager).`when`(context).assets
        Mockito.`when`(context.assets.open(anyString())).thenReturn(testStream)

        try {
            val stream: InputStream = context.assets.open("surah_detail.json")
            val size: Int = stream.available()
            val buffer = ByteArray(size)
            stream.read(buffer)
            stream.close()
            val assetString = String(buffer)
            val gson = Gson()
            surahDetailResponse = gson.fromJson(assetString,SurahDetailResponse::class.java)

        } catch (e: IOException) {
            // Handle IO exceptions here
        } catch (e: JSONException) {
            // Handle JSON exceptions here
        }
        assertEquals(200,surahDetailResponse.code)
    }


     fun getAssetJSON() {
        try {
            val stream: InputStream = context.assets.open("surah_detail.json")
            val size: Int = stream.available()
            val buffer = ByteArray(size)
            stream.read(buffer)
            stream.close()
            val assetString = String(buffer)
            val gson = Gson()
            surahDetailResponse = gson.fromJson(assetString,SurahDetailResponse::class.java)

        } catch (e: IOException) {
            // Handle IO exceptions here
        } catch (e: JSONException) {
            // Handle JSON exceptions here
        }
    }
    @After
    fun tearDown() {

    }
}


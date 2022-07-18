package com.example.demo.di

import android.content.Context
import androidx.room.Room
import com.example.demo.cons.Cons.BASE_URL
import com.example.demo.database.*
import com.example.demo.network.ApiService
import com.example.demo.network.ApiService2
import com.example.demo.network.ApiServiceImpl
import com.example.demo.repository.MainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesSurahDatabase(@ApplicationContext context: Context): QuranDatabase =
        Room.databaseBuilder(context, QuranDatabase::class.java, "AlertDatabase")
            .allowMainThreadQueries().build()

    @Provides
    fun providesSurahDao(userDatabase: QuranDatabase): SurahDao = userDatabase.userDao()



    @Provides
    fun providesSurahRepository(userDao: SurahDao): SurahRepository = SurahRepository(userDao)

    @Provides
    fun providesParaDao(userDatabase: QuranDatabase): ParaDao = userDatabase.paraDao()

    @Provides
    fun providesParaRepository(userDao: ParaDao): ParaRepository = ParaRepository(userDao)

    @Provides
    fun providesUrlTest() = BASE_URL

    @Singleton
    @Provides
    fun providesOkHttpClient(): OkHttpClient =
        OkHttpClient
            .Builder()
           // .addInterceptor(BasicAuthInterceptor("PortOfOakland", "OaklandPortal@2022!*"))
            .build()

    @Provides
    @Singleton
    fun providesApiService(okHttpClient: OkHttpClient, url: String): ApiService =
        Retrofit.Builder()
            .baseUrl(url)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)


    @Provides
    @Singleton
    fun providesApiService2(okHttpClient: OkHttpClient, url: String): ApiService2 =
        Retrofit.Builder()
            .baseUrl(url)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService2::class.java)


}
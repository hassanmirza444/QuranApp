package com.example.demo.di

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BaseApp : Application() {

    override fun onCreate() {
        super.onCreate()
        context = this
    }
    companion object{
        lateinit var context: Context
    }
}
package com.example.demo.util

import android.content.Context
import android.content.SharedPreferences
import com.example.demo.di.BaseApp

class QuranAppSharedPreferences private constructor() {
    fun removeKey(key: String?) {
        if (sharedPreferences != null) {
            sharedPreferences!!.edit().remove(key).apply()
        }
    }

    fun clear() {
        if (sharedPreferences != null) {
            sharedPreferences!!.edit().clear().apply()
        }
    }

    operator fun contains(key: String?): Boolean {
        return if (sharedPreferences!!.contains(key)) true else false
    }

    fun setString(key: String, value: String) {
        sharedPreferences!!.edit().putString(key.trim { it <= ' ' }, value.trim { it <= ' ' })
            .apply()
    }


    fun setQuranRecitor(value: String) {
        sharedPreferences!!.edit()
            .putString("quran_recitor".trim { it <= ' ' }, value.trim { it <= ' ' })
            .apply()
    }

    fun setTranslationRecitor(value: String) {
        sharedPreferences!!.edit()
            .putString("translation_recitor".trim { it <= ' ' }, value.trim { it <= ' ' })
            .apply()
    }

    fun setTafsirRecitor(value: String) {
        sharedPreferences!!.edit()
            .putString("tafsir_recitor".trim { it <= ' ' }, value.trim { it <= ' ' })
            .apply()
    }

    fun setTransliterationRecitor(value: String) {
        sharedPreferences!!.edit()
            .putString("transliteration_recitor".trim { it <= ' ' }, value.trim { it <= ' ' })
            .apply()
    }

    fun getQuranRecitor(): String {
        return sharedPreferences!!.getString("quran_recitor".trim { it <= ' ' }, "")!!
            .trim { it <= ' ' }
    }

    fun getTranslationRecitor(): String {
        return sharedPreferences!!.getString("translation_recitor".trim { it <= ' ' }, "")!!
            .trim { it <= ' ' }
    }

    fun getTafsirRecitor(): String {
        return sharedPreferences!!.getString("tafsir_recitor".trim { it <= ' ' }, "")!!
            .trim { it <= ' ' }
    }

    fun getTransliterationRecitor(): String {
        return sharedPreferences!!.getString("transliteration_recitor".trim { it <= ' ' }, "")!!
            .trim { it <= ' ' }
    }


    fun getString(key: String): String {
        return sharedPreferences!!.getString(key.trim { it <= ' ' }, "")!!
            .trim { it <= ' ' }
    }


    fun getEditionString(): String {
        var edition = ""
        if (QuranAppSharedPreferences.instance!!.getQuranRecitor().isNotEmpty()) {
            edition = QuranAppSharedPreferences.instance!!.getQuranRecitor().plus(",")
        } else {
            edition = "quran-simple,"
        }

        if (QuranAppSharedPreferences.instance!!.getTranslationRecitor().isNotEmpty()) {
            edition =
                edition.plus(QuranAppSharedPreferences.instance!!.getTranslationRecitor().plus(","))
        }

        if (QuranAppSharedPreferences.instance!!.getTransliterationRecitor().isNotEmpty()) {
            edition = edition.plus(QuranAppSharedPreferences.instance!!.getTransliterationRecitor()
                .plus(","))
        }
        if (QuranAppSharedPreferences.instance!!.getTafsirRecitor().isNotEmpty()) {
            edition =
                edition.plus(QuranAppSharedPreferences.instance!!.getTafsirRecitor().plus(","))
        }

        return edition
    }

    fun setInt(key: String?, value: Int) {
        sharedPreferences!!.edit().putInt(key, value).apply()
    }

    fun getInt(key: String?): Int {
        return sharedPreferences!!.getInt(key, -1)
    }

    fun setLong(key: String?, value: Long) {
        sharedPreferences!!.edit().putLong(key, value).apply()
    }

    fun getLong(key: String?): Long {
        return sharedPreferences!!.getLong(key, -1)
    }

    fun setBoolean(key: String?, value: Boolean) {
        sharedPreferences!!.edit().putBoolean(key, value).apply()
    }

    fun getBoolean(key: String?): Boolean {
        return sharedPreferences!!.getBoolean(key, false)
    }

    fun setFloat(key: String?, value: Float) {
        sharedPreferences!!.edit().putFloat(key, value).apply()
    }

    fun getFloat(key: String?): Float {
        return sharedPreferences!!.getFloat(key, 0f)
    }

    companion object {
        private var sharedPreferences: SharedPreferences? = null
        private var appPreferences: QuranAppSharedPreferences? = null
        val instance: QuranAppSharedPreferences?
            get() {
                if (appPreferences == null) {
                    appPreferences = QuranAppSharedPreferences()
                    if (sharedPreferences == null) {
                        sharedPreferences =
                            BaseApp.context.getSharedPreferences("quran_app_shared_pref",
                                Context.MODE_PRIVATE)
                    }
                }
                return appPreferences
            }
    }
}
package com.example.demo.models

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import com.example.demo.models.Translations

data class Chapter (
    @SerializedName("id")
    @Expose
    private val id: Int? = null,

    @SerializedName("name")
    @Expose
    private val name: String? = null,

    @SerializedName("transliteration")
    @Expose
    private val transliteration: String? = null,

    @SerializedName("translations")
    @Expose
    private val translations: Translations? = null,

    @SerializedName("type")
    @Expose
    private val type: String? = null,
)
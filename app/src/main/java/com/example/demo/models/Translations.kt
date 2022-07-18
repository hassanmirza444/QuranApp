package com.example.demo.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Translations(
    @SerializedName("en")
    @Expose
    private val en: String? = null,

    @SerializedName("es")
    @Expose
    private val es: String? = null,

    @SerializedName("fr")
    @Expose
    private val fr: String? = null,

    @SerializedName("id")
    @Expose
    private val id: String? = null,

    @SerializedName("ru")
    @Expose
    private val ru: String? = null,

    @SerializedName("sv")
    @Expose
    private val sv: String? = null,

    @SerializedName("tr")
    @Expose
    private val tr: String? = null,

    @SerializedName("ur")
    @Expose
    private val ur: String? = null,

    @SerializedName("zh")
    @Expose
    private val zh: String? = null,
)
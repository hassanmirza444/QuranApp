package com.example.demo.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import javax.annotation.Nonnull

@Entity
class ParaInfo(

    @PrimaryKey
    @SerializedName("number")
    @Expose
    @Nonnull
    var number: Int,

    @SerializedName("name")
    @Expose
    var name: String? = null,

    @SerializedName("englishName")
    @Expose
    var englishName: String? = null,

    @SerializedName("englishNameTranslation")
    @Expose
    var englishNameTranslation: String? = null,

    @SerializedName("revelationType")
    @Expose
    var revelationType: String? = null,

    @SerializedName("numberOfAyahs")
    @Expose
    var numberOfAyahs: Int? = null,

){

}
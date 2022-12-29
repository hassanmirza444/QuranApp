package com.example.demo.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ParahDetail {

    @SerializedName("number")
    @Expose
    private Integer number;

    @SerializedName("ayahs")
    @Expose
    private List<Ayah> ayahs = null;

    @SerializedName("edition")
    @Expose
    private Edition edition;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public List<Ayah> getAyahs() {
        return ayahs;
    }

    public void setAyahs(List<Ayah> ayahs) {
        this.ayahs = ayahs;
    }

    public Edition getEdition() {
        return edition;
    }

    public void setEdition(Edition edition) {
        this.edition = edition;
    }

}

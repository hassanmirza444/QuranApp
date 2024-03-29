package com.example.demo.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Recitor {

    //{"identifier":"az.mammadaliyev","language":"az",
    // "name":"M\u0259mm\u0259d\u0259liyev & B\u00fcnyadov",
    // "englishName":"Vasim Mammadaliyev and Ziya Bunyadov",
    // "format":"text","type":"translation","direction":"ltr"}
    @SerializedName("identifier")
    @Expose
    private String identifier;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("englishName")
    @Expose
    private String englishName;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("direction")
    @Expose
    private String direction;
    @SerializedName("format")
    @Expose
    private String format;


    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}

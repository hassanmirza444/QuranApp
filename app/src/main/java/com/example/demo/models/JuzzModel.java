package com.example.demo.models;

/**
 * Created by RanaTalal on 9/6/2017.
 */

public class JuzzModel {
    private int juzzNo;
    private String arabicText;
    private int surahNo;
    private int ayatNo;

    public int getJuzzNo() {
        return juzzNo;
    }

    public void setJuzzNo(int juzzNo) {
        this.juzzNo = juzzNo;
    }

    public String getArabicText() {
        return arabicText;
    }

    public void setArabicText(String arabicText) {
        this.arabicText = arabicText;
    }

    public int getSurahNo() {
        return surahNo;
    }

    public void setSurahNo(int surahNo) {
        this.surahNo = surahNo;
    }

    public int getAyatNo() {
        return ayatNo;
    }

    public void setAyatNo(int ayatNo) {
        this.ayatNo = ayatNo;
    }

    public JuzzModel(int juzzNo, String arabicText, int surahNo, int ayatNo) {

        this.juzzNo = juzzNo;
        this.arabicText = arabicText;
        this.surahNo = surahNo;
        this.ayatNo = ayatNo;

    }
}

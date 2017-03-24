package com.kawnayeen.muhhsinin.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kawnayeen on 3/24/17.
 */

public class SurahInfo {
    @SerializedName("number")
    private int surahNumber;
    private String name;
    @SerializedName("englishName")
    private String transliteration;
    @SerializedName("englishNameTranslation")
    private String translation;
    @SerializedName("numberOfAyahs")
    private int numberOfAyat;
    private RevelationType revelationType;

    public int getSurahNumber() {
        return surahNumber;
    }

    public void setSurahNumber(int surahNumber) {
        this.surahNumber = surahNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTransliteration() {
        return transliteration;
    }

    public void setTransliteration(String transliteration) {
        this.transliteration = transliteration;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public int getNumberOfAyat() {
        return numberOfAyat;
    }

    public void setNumberOfAyat(int numberOfAyat) {
        this.numberOfAyat = numberOfAyat;
    }

    public RevelationType getRevelationType() {
        return revelationType;
    }

    public void setRevelationType(RevelationType revelationType) {
        this.revelationType = revelationType;
    }

    @Override
    public String toString() {
        return "SurahInfo{" +
                "surahNumber=" + surahNumber +
                ", name='" + name + '\'' +
                ", transliteration='" + transliteration + '\'' +
                ", translation='" + translation + '\'' +
                ", numberOfAyat=" + numberOfAyat +
                ", revelationType=" + revelationType +
                '}';
    }
}

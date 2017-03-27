package com.kawnayeen.muhhsinin.model;

/**
 * Created by kawnayeen on 3/27/17.
 */

public class AyatInfo {
    int id;
    String arabic;
    String english;
    String bengali;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArabic() {
        return arabic;
    }

    public void setArabic(String arabic) {
        this.arabic = arabic;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getBengali() {
        return bengali;
    }

    public void setBengali(String bengali) {
        this.bengali = bengali;
    }

    @Override
    public String toString() {
        return "AyatInfo{" +
                "id=" + id +
                ", arabic='" + arabic + '\'' +
                ", english='" + english + '\'' +
                ", bengali='" + bengali + '\'' +
                '}';
    }
}

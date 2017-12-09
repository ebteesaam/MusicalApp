package com.example.android.musicalapp;

/**
 * Created by ebtesam on 12/9/2017 AD.
 */

public class Music {
    private String NameOfTheMusic;
    private String NameOftheArtist;


    public Music(String nameOftheArtist, String nameOfTheMusic) {
        NameOftheArtist = nameOftheArtist;
        NameOfTheMusic = nameOfTheMusic;
    }


    public String getNameOfTheMusic() {
        return NameOfTheMusic;
    }

    public String getNameOftheArtist() {
        return NameOftheArtist;
    }
}

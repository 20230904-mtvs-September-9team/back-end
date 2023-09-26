package com.sangsang.imagination.music.dto;

public class SelectionRequest {
    private String artist;
    private String song;


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
}

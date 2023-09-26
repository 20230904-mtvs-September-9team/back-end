package com.sangsang.imagination.music.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Selection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String selectedArtist;
    private String selectedSong;

    public void setSelectedArtist(String selectedArtist) {
        this.selectedArtist = selectedArtist;
    }

    public String getSelectedArtist() {
        return selectedArtist;
    }

    public void setSelectedSong(String selectedSong) {
        this.selectedSong = selectedSong;
    }

    public String getSelectedSong() {
        return selectedSong;
    }

}

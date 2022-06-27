package com.demo.springdemo.model;

public class Song {
    private String title;
    private String album;
    private int lengthInSeconds;
    private int releaseYear;

    public Song(String title, String album, int lengthInSeconds, int releaseYear) {
        this.title = title;
        this.album = album;
        this.lengthInSeconds = lengthInSeconds;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getLengthInSeconds() {
        return lengthInSeconds;
    }

    public void setLengthInSeconds(int lengthInSeconds) {
        this.lengthInSeconds = lengthInSeconds;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String lengthToString(Song current) {
        int nrMin = current.lengthInSeconds / 60;
        int nrSec = current.lengthInSeconds % 59;
        return String.valueOf(nrMin) + ":" + String.valueOf(nrSec);
    }
}

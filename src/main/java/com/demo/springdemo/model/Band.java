package com.demo.springdemo.model;

public class Band {
    private String name;
    private String genre;
    private String countryOfOrigin;
    private int foundingYear;
    private int numberOfAlbums;

    public Band(String name, String genre, String countryOfOrigin, int foundingYear, int numberOfAlbums) {
        this.name = name;
        this.genre = genre;
        this.countryOfOrigin = countryOfOrigin;
        this.foundingYear = foundingYear;
        this.numberOfAlbums = numberOfAlbums;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public int getFoundingYear() {
        return foundingYear;
    }

    public void setFoundingYear(int foundingYear) {
        this.foundingYear = foundingYear;
    }

    public int getNumberOfAlbums() {
        return numberOfAlbums;
    }

    public void setNumberOfAlbums(int numberOfAlbums) {
        this.numberOfAlbums = numberOfAlbums;
    }
}

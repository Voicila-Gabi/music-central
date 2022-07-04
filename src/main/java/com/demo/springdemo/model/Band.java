package com.demo.springdemo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Band {
    private String name;
    private String genre;
    private String countryOfOrigin;
    private int foundingYear;
    private int numberOfAlbums;

    public Band() {
    }
}
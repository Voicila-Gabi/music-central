package com.demo.springdemo.model;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
public class Band {
    private String name;
    private String genre;
    private String countryOfOrigin;
    private int foundingYear;
    private int numberOfAlbums;

}
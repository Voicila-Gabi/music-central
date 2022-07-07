package com.demo.springdemo.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="t_band")
public class Band {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;
    @Column(name = "genre")
    private String genre;
    @Column(name = "country_of_origin")
    private String countryOfOrigin;
    @Column(name = "year_of_founding")
    private int foundingYear;
    @Column(name = "number_of_albums")
    private int numberOfAlbums;

}
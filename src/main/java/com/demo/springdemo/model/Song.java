package com.demo.springdemo.model;


import lombok.*;

import javax.persistence.*;

//lombok
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
//spring-jpa
@Entity
@Table(name="t_song")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")     //ca in schema.sql
    private String title;
    @Column(name = "album")
    private String album;
    //@Column(name = "band")
    //private String band;
    @Column(name = "length_in_seconds")
    private int lengthInSeconds;
    @Column(name = "release_year")
    private int releaseYear;

    @ManyToOne
    @JoinColumn(name = "id_band")
    private Band band;

}

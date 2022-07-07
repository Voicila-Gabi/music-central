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
@SequenceGenerator(name="song_id_seq", initialValue=13, allocationSize=100) //HARDCODED initial value = id + 1 fata de ultimul din data.sql (date initiale ca sa nu fie tabelul gol)
public class Song {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)   //pt generare automata - atunci trebuie eliminate datele introduse in data.sql
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="song_id_seq")
    private int id;

    @Column(name = "title")     //ca in schema.sql
    private String title;
    @Column(name = "album")
    private String album;
    @Column(name = "length_in_seconds")
    private int lengthInSeconds;
    @Column(name = "release_year")
    private int releaseYear;

}

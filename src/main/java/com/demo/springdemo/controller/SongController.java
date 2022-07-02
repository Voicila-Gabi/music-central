package com.demo.springdemo.controller;

import com.demo.springdemo.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SongController {
    //http://localhost:8080/song
    @GetMapping(value = "/song")
    public String song(Model model) {

        List<Song> songList = List.of(
                Song.builder()      //builderul din lombok. Putem folosi cate campuri ale clasei vrem, in ce ordine vrem
                        .title("New Kid in Town")
                        .album("Hotel California")
                        .lengthInSeconds(300)
                        .releaseYear(1976)
                        .build(),
                Song.builder()
                        .title("Hotel California")
                        .album("Hotel California")
                        .lengthInSeconds(401)
                        .releaseYear(1976)
                        .build(),
                Song.builder()
                        .title("Take it to the limit")
                        .album("One of These Nights")
                        .lengthInSeconds(352)
                        .releaseYear(1980)
                        .build(),
                Song.builder()
                        .title("Nothing Else Matters")
                        .album("Metallica")
                        .lengthInSeconds(350)
                        .releaseYear(1980)
                        .build(),
                Song.builder()
                        .title("One")
                        .album("And Justice for All")
                        .lengthInSeconds(350)
                        .releaseYear(1990)
                        .build(),
                Song.builder()
                        .title("Master Of Puppets")
                        .album("Master Of Puppets")
                        .lengthInSeconds(600)
                        .releaseYear(1990)
                        .build(),
                Song.builder()
                        .title("Lay All Your Love On Me")
                        .album("Super Trouper")
                        .lengthInSeconds(300)
                        .releaseYear(2000)
                        .build(),
                Song.builder()
                        .title("The Winner Takes It All")
                        .album("Super Trouper")
                        .lengthInSeconds(355)
                        .releaseYear(2000)
                        .build(),
                Song.builder()
                        .title("Dancing Queen")
                        .album("Arrival")
                        .lengthInSeconds(347)
                        .releaseYear(2001)
                        .build(),
                Song.builder()
                        .title("Omen")
                        .album("Invaders Must Die")
                        .lengthInSeconds(400)
                        .releaseYear(1999)
                        .build(),
                Song.builder()
                        .title("Need Some1")
                        .album("No Tourists")
                        .lengthInSeconds(333)
                        .releaseYear(1990)
                        .build(),
                Song.builder()
                        .title("Light Up the Sky")
                        .album("No Tourists")
                        .lengthInSeconds(350)
                        .releaseYear(1990)
                        .build()
        );

        model.addAttribute("songList", songList);

        return "song";
    }

}

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
                new Song("New Kid in Town","Hotel California",300,1980),
                new Song("Hotel California","Hotel California",400,1980),
                new Song("Take it to the limit","One of These Nights",350,1980),
                new Song("Nothing Else Matters","Metallica ",350,1980),
                new Song("One","And Justice for All",350,1980),
                new Song("Master Of Puppets","Master Of Puppets",300,1980),
                new Song("Lay All Your Love On Me","Super Trouper",300,1980),
                new Song("Dancing Queen","Arrival",300,1980),
                new Song("Omen","Invaders Must Die",350,1980),
                new Song("Need Some1","No Tourists",350,1980),
                new Song("Light Up the Sky","No Tourists",350,1980)
        );

        model.addAttribute("songList", songList);

        return "song";
    }

}

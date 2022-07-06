package com.demo.springdemo.controller;

import com.demo.springdemo.model.Song;
import com.demo.springdemo.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddSongController {

    @Autowired
    SongRepository songRepository;

    @GetMapping(value = "/addSong")
    public String song(Model model) {
        //Song mySong = new Song();
        Song mySong = Song.builder().build();   //creaza un obiect la fel ca un constructor fara paramterii
        model.addAttribute("song",mySong);
        return "addSong";
    }

    @PostMapping(value = "/submitSong")
    public String submitSong(@ModelAttribute Song song) {
        System.out.println("Hello form submit Song");
        System.out.println(song.getTitle());
        System.out.println(song.getAlbum());
        System.out.println(song.getLengthInSeconds());
        System.out.println(song.getReleaseYear());

        saveToDatabase(song);

        return "addSong";
    }

    private void saveToDatabase(Song song) {
        //TO DO save to database
        songRepository.save(song);
    }
}

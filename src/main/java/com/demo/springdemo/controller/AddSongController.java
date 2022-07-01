package com.demo.springdemo.controller;

import com.demo.springdemo.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AddSongController {

    @GetMapping(value = "/addSong")
    public String song(Model model) {
        Song mySong = new Song();
        model.addAttribute("song",mySong);
        return "addSong";
    }

    @PostMapping(value = "/submitSong")
    public String submitSong(@ModelAttribute Song song) {
        System.out.println("Hello form submitSong");

        saveToDatabase(song);

        return "addSong";
    }

    private void saveToDatabase(Song song) {
        //TO DO save to database
    }
}

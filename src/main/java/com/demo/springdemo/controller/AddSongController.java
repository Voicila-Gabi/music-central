package com.demo.springdemo.controller;

import com.demo.springdemo.model.Band;
import com.demo.springdemo.model.Song;
import com.demo.springdemo.repository.BandRepository;
import com.demo.springdemo.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AddSongController {

    @Autowired
    SongRepository songRepository;

    @Autowired
    BandRepository bandRepository;

    @GetMapping(value = "/addSong")
    public String song(Model model) {
        List<Band> bandList = bandRepository.findAll();
        model.addAttribute("bandList", bandList);

        Song mySong = Song.builder().build();   //creaza un obiect la fel ca un constructor fara paramterii
        model.addAttribute("song",mySong);
        return "addSong";   //addSong.html
    }

    @PostMapping(value = "/submitSong")
    public String submitSong(@ModelAttribute Song song) {
/*        System.out.println("Hello form submit Song");
        System.out.println(song.getTitle());
        System.out.println(song.getAlbum());
        System.out.println(song.getLengthInSeconds());
        System.out.println(song.getReleaseYear());*/

        saveToDatabase(song);

        return "redirect:/song";    //va apela controllerul paginii
    }

    private void saveToDatabase(Song song) {
        songRepository.save(song);
    }
}

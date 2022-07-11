package com.demo.springdemo.controller;

import com.demo.springdemo.model.Band;
import com.demo.springdemo.model.Song;
import com.demo.springdemo.repository.BandRepository;
import com.demo.springdemo.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SongController {

    @Autowired
    SongRepository songRepository;

    @Autowired
    BandRepository bandRepository;

    //http://localhost:8080/song
    @GetMapping(value = "/song")
    public String song(Model model) {
        List<Song> songList = songRepository.findAll();
        model.addAttribute("songList", songList);

        return "song";
    }

    @PostMapping(value="/editSong")
    public String editSong(@RequestParam("songId") int id, Model model) {
        Song song = songRepository.findById(id).get();
        model.addAttribute("song", song);

        List<Band> bandList = bandRepository.findAll();
        model.addAttribute("bandList", bandList);

        return "addSong";     //songForm //va apela pagina html addSong
    }

    @PostMapping(value="/deleteSong")
    public String deleteSong(@RequestParam("songId") int id) {
        songRepository.deleteById(id);
        return"redirect:/song";
    }

}

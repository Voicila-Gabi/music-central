package com.demo.springdemo.controller;

import com.demo.springdemo.model.Song;
import com.demo.springdemo.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SongController {

    @Autowired
    SongRepository songRepository;

    //http://localhost:8080/song
    @GetMapping(value = "/song")
    public String song(Model model) {
        List<Song> songList = songRepository.findAll();
        model.addAttribute("songList", songList);

        return "song";
    }

}

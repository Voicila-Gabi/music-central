package com.demo.springdemo.controller;

import com.demo.springdemo.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AddSongController {

    @GetMapping(value = "/addSong")
    public String song() {

        return "addSong";
    }

}

//NOT USED IN APPLICATION. DEMONSTRATION PURPOSES ONLY.
//
package com.demo.springdemo.controller;

import com.demo.springdemo.model.Song;
import com.demo.springdemo.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SongDatabaseController {

    @Autowired
    SongRepository songRepository;

    @GetMapping(value = "/createSong")
    @ResponseBody
    public String createSong() {    //saveSong?

        Song song = Song.builder()
                .title("titlu 1")
                .album("album 1")
                .lengthInSeconds(250)
                .releaseYear(1981)
                .build();
        songRepository.save(song);

        return "OK";
    }

    @GetMapping(value = "/showSongs")
    @ResponseBody
    public String showSongs() {
        List<Song> songList = songRepository.findAll();
        for (Song s : songList) {
            System.out.println(s.toString());
        }
        return "OK";
    }
}

package com.demo.springdemo.controller;

import com.demo.springdemo.model.Band;
import com.demo.springdemo.repository.BandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BandDatabaseController {

    @Autowired
    BandRepository bandRepository;

    @GetMapping(value = "/createBand")
    @ResponseBody
    public String createBand(){
        Band band = Band.builder()
                .name("")
                .genre("")
                .countryOfOrigin("")
                .foundingYear(2001)
                .numberOfAlbums(3)
                .build();
        bandRepository.save(band);
        List<Band> bandList = bandRepository.findAll();
        for (Band b : bandList){
            System.out.println(b.toString());
        }
        return "";
    }

}

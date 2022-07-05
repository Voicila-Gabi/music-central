package com.demo.springdemo.controller;

import com.demo.springdemo.model.Band;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddBandController {

    @GetMapping(value = "/addBand")
    public String band(Model model) {
        Band myBand = Band.builder().build();
        model.addAttribute("band",myBand);
        return "addBand";
    }
    @PostMapping(value = "/submitBand")
    public String submitBand(@ModelAttribute Band band) {
        System.out.println(band.getName());
        System.out.println(band.getGenre());
        System.out.println(band.getCountryOfOrigin());
        System.out.println(band.getFoundingYear());
        System.out.println(band.getNumberOfAlbums());
        saveToDatabase(band);
        return "addBand";
    }

    private void saveToDatabase(Band band) {
    }

}
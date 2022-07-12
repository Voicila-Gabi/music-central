package com.demo.springdemo.controller;

import com.demo.springdemo.model.Band;
import com.demo.springdemo.repository.BandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddBandController {
    @Autowired
    BandRepository bandRepository;


    @GetMapping(value = "/addBand")
    public String band(Model model) {
        Band myBand = Band.builder().build();
        model.addAttribute("band",myBand);
        return "addBand";
    }
    @PostMapping(value = "/submitBand")
    public String submitBand(@ModelAttribute Band band) {
        saveToDatabase(band);
        return "redirect:/band";
    }

    private void saveToDatabase(Band band) {
        bandRepository.save(band);
    }

}
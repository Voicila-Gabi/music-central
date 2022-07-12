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
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BandController {
    @Autowired
    BandRepository bandRepository;
    SongRepository songRepository;
    @GetMapping(value = "/band")
    public String band(Model model) {
        List<Band> bandList = bandRepository.findAll();

        model.addAttribute("bandList",bandList);
        return "band";
    }
    @PostMapping(value="/editBand")
    public String editBand(@RequestParam("bandID") int id, Model model) {
        Band band = bandRepository.findById(id).get();
        model.addAttribute("band", band);

        return "addBand";
    }

    @PostMapping(value="/deleteBand")
    public String deleteBand(@RequestParam("bandID") int id) {
        bandRepository.deleteById(id);
        return"redirect:/band";
    }

}

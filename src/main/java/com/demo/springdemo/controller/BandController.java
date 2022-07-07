package com.demo.springdemo.controller;

import com.demo.springdemo.model.Band;
import com.demo.springdemo.model.Song;
import com.demo.springdemo.repository.BandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BandController {
    @Autowired
    BandRepository bandRepository;
    @GetMapping(value = "/band")
    public String band(Model model) {
        List<Band> bandList = bandRepository.findAll();

        model.addAttribute("bandList",bandList);
        return "band";
    }

}

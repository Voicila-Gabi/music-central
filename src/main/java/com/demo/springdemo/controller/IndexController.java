package com.demo.springdemo.controller;

import com.demo.springdemo.model.Band;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {
    //http://localhost:8080/index
    @GetMapping(value = "/index")
    public String index(Model model) {

        List<Band>  bandList = List.of(
                new Band("Eagles","Rock","USA", 1971, 7),
                new Band("Metallica","Heavy metal","USA",1981,10),
                new Band("ABBA","Pop","Sweden",1972,9),
                new Band("The Prodigy","EDM","UK",1990,7)
        );

        model.addAttribute("bandList", bandList);



        return "index"; //sau index.html
    }

}

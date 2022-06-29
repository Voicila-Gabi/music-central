package com.demo.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddBandController {

    @GetMapping(value = "/addBand")
    public String band() {

        return "addBand";
    }

}
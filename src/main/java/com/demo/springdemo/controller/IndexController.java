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

        return "index"; //sau index.html
    }

}

package com.demo.springdemo.controller;

import com.demo.springdemo.model.Band;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BandController {
    @GetMapping(value = "/band")
    public String band(Model model) {
//        List<Band> bandList = List.of(
//                Band.builder()
//                        .name("Eagles")
//                        .genre("Rock")
//                        .countryOfOrigin("USA")
//                        .foundingYear(1971)
//                        .numberOfAlbums(7)
//                        .build(),
//                Band.builder()
//                        .name("Metalica")
//                        .genre("Heavy metal")
//                        .countryOfOrigin("USA")
//                        .foundingYear(1981)
//                        .numberOfAlbums(10)
//                        .build(),
//                Band.builder()
//                        .name("ABBA")
//                        .genre("Pop")
//                        .countryOfOrigin("Sweden")
//                        .foundingYear(1972)
//                        .numberOfAlbums(9)
//                        .build(),
//                Band.builder()
//                        .name("The Prodigy")
//                        .genre("EDM")
//                        .countryOfOrigin("UK")
//                        .foundingYear(1990)
//                        .numberOfAlbums(7)
//                        .build()
//        );
//
//        model.addAttribute("bandList",bandList);
        return "band";
    }
}

package com.booking.movie.controller;


import com.booking.movie.entity.Theatre;
import com.booking.movie.service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/theatres")
public class TheatreController {


    @Autowired
    private TheatreService theatreService;


    @PostMapping
    public Theatre onboard(@RequestBody Theatre theatre) {
        return theatreService.onboard(theatre);
    }
}
package com.booking.movie.controller;


import com.booking.movie.entity.Movie;
import com.booking.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {


    @Autowired
    private MovieService movieService;


    @GetMapping("/search")
    public List<Movie> search(@RequestParam String city,
                              @RequestParam String language,
                              @RequestParam String genre) {
        return movieService.search(city, language, genre);
    }
}
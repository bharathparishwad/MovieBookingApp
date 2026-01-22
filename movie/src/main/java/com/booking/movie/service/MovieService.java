package com.booking.movie.service;

import com.booking.movie.Repository.MovieRepository;
import com.booking.movie.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService {


@Autowired
private MovieRepository movieRepository;


public List<Movie> search(String city, String language, String genre) {
return movieRepository.findAll().stream()
.filter(m -> m.getLanguage().equalsIgnoreCase(language))
.filter(m -> m.getGenre().equalsIgnoreCase(genre))
.collect(Collectors.toList());
}
}
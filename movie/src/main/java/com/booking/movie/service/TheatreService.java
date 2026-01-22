package com.booking.movie.service;

import com.booking.movie.Repository.TheatreRepository;
import com.booking.movie.entity.Theatre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TheatreService {


@Autowired
private TheatreRepository theatreRepository;


public Theatre onboard(Theatre theatre) {
return theatreRepository.save(theatre);
}
}
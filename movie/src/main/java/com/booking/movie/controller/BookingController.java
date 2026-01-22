package com.booking.movie.controller;


import com.booking.movie.Repository.ShowRepository;
import com.booking.movie.entity.Booking;
import com.booking.movie.entity.Show;
import com.booking.movie.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {


    @Autowired
    private BookingService bookingService;
    @Autowired
    private ShowRepository showRepository;


    @PostMapping
    public Booking book(@RequestParam Long showId,
                        @RequestParam String customer,
                        @RequestParam int seats) {
        Show show = showRepository.findById(showId).orElseThrow();
        return bookingService.book(show, customer, seats);
    }
}
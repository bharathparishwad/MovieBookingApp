package com.booking.movie.service;


import com.booking.movie.Repository.BookingRepository;
import com.booking.movie.entity.Booking;
import com.booking.movie.entity.Show;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {


    @Autowired
    private BookingRepository bookingRepository;


    public Booking book(Show show, String customer, int seats) {
        Booking booking = new Booking();
        booking.setShow(show);
        booking.setCustomerName(customer);
        booking.setSeatCount(seats);
        return bookingRepository.save(booking);
    }
}
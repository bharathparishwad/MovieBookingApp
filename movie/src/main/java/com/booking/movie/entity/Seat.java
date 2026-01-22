package com.booking.movie.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Seat {


@Id
@GeneratedValue
private Long id;


private String seatNumber;
private boolean booked;
}
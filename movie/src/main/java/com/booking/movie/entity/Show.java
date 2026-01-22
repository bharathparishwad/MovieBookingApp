package com.booking.movie.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class Show {


@Id
@GeneratedValue
private Long id;


@ManyToOne
private Movie movie;


@ManyToOne
private Theatre theatre;


private LocalDateTime showTime;
}
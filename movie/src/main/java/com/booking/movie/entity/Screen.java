package com.booking.movie.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Screen {


@Id
@GeneratedValue
private Long id;


private String name;


@OneToMany(cascade = CascadeType.ALL)
private List<Seat> seats = new ArrayList<>();
}
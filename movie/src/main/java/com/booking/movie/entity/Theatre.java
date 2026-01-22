package com.booking.movie.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Theatre {


@Id
@GeneratedValue
private Long id;


private String name;
private String city;


@OneToMany(cascade = CascadeType.ALL)
private List<Screen> screens = new ArrayList<>();
}
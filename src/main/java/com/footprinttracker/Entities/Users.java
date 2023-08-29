package com.footprinttracker.Entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Keywords> keywords;

    @OneToMany(mappedBy = "user")
    private List<Alerts> alerts;

    // Constructors, getters, setters, etc.
}
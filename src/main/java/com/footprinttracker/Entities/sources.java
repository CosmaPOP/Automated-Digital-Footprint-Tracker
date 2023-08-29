package com.footprinttracker.Entities;

import jakarta.persistence.*;

@Entity
public class sources {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    // Other fields, constructors, getters, setters, etc.
}



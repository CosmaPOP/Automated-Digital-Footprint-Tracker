package com.footprinttracker.Entities;

import jakarta.persistence.*;

@Entity
public class Alerts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;


}

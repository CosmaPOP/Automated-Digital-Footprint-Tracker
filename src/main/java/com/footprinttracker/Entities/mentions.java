package com.footprinttracker.Entities;

import jakarta.persistence.*;

@Entity
public class mentions {
@Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

    @ManyToOne
    @JoinColumn(name = "source_id")
    private sources source;
}

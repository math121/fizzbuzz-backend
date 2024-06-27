package org.demo.fizzbuzzbackend.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Scoreboard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String user_name;
    private LocalDateTime time;
    private int score;
}

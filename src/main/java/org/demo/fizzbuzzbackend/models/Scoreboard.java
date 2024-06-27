package org.demo.fizzbuzzbackend.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Scoreboard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private LocalDateTime time;
    private int score;

    public Scoreboard(String userName, LocalDateTime time, int score) {
        this.userName = userName;
        this.time = time;
        this.score = score;
    }

    public Scoreboard() {

    }

    public Long getId() {
        return id;
    }

    public String getUser_name() {
        return userName;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public int getScore() {
        return score;
    }
}

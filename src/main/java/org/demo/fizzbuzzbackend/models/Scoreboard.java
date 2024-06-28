package org.demo.fizzbuzzbackend.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Scoreboard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime time;
    private int score;

    @OneToOne
    @JoinColumn(name = "user_id")
    private FizzBuzzUser fizzBuzzUser;


    public Scoreboard(LocalDateTime time, int score) {
        this.time = time;
        this.score = score;
    }

    public Scoreboard() {

    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public int getScore() {
        return score;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FizzBuzzUser getFizzBuzzUser() {
        return fizzBuzzUser;
    }

    public void setFizzBuzzUser(FizzBuzzUser fizzBuzzUser) {
        this.fizzBuzzUser = fizzBuzzUser;
    }
}

package org.demo.fizzbuzzbackend.controllers;

import org.demo.fizzbuzzbackend.dtos.FizzBuzzDTO;
import org.demo.fizzbuzzbackend.dtos.ScoreboardDTO;
import org.demo.fizzbuzzbackend.models.Scoreboard;
import org.demo.fizzbuzzbackend.services.FizzBuzzService;
import org.demo.fizzbuzzbackend.services.ScoreboardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/scoreboard")
public class ScoreboardController {

    private final ScoreboardService service;

    public ScoreboardController(ScoreboardService service) {
        this.service = service;
    }

    @GetMapping
    public List<Scoreboard> getFizzBuzzNumbers() {
        return service.getScoreboard();
    }

    @PostMapping
    public Scoreboard addScore(@RequestBody ScoreboardDTO scoreboardDTO) {
        Scoreboard scoreboard = new Scoreboard(scoreboardDTO.userName(),
                scoreboardDTO.time(), scoreboardDTO.score());
        return service.addScoreboard(scoreboard);
    }

}

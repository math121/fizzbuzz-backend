package org.demo.fizzbuzzbackend.controllers;

import org.demo.fizzbuzzbackend.dtos.ScoreboardDTO;
import org.demo.fizzbuzzbackend.models.Scoreboard;
import org.demo.fizzbuzzbackend.services.ScoreboardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/scoreboard")
@CrossOrigin(origins = "http://localhost:5173/")
public class ScoreboardController {

    private final ScoreboardService service;

    public ScoreboardController(ScoreboardService service) {
        this.service = service;
    }

    @GetMapping
    public List<Scoreboard> getScoreboard() {
        return service.getScoreboard();
    }

    @PostMapping
    public Scoreboard addScore(@RequestBody ScoreboardDTO scoreboardDTO) {
        Scoreboard scoreboard = new Scoreboard(scoreboardDTO.time(), scoreboardDTO.score());
        return service.addScoreboard(scoreboardDTO.userName(), scoreboard);
    }

    @GetMapping("/{name}")
    public Scoreboard getScoreBoardForUser(@PathVariable String name) {
        return service.getScoreboardForUser(name);
    }

    /*@PatchMapping("/{id}")
    public int updateNameOnScoreboard(@PathVariable Long id, @RequestParam String name) {
        return service.updateNameOnScoreboard(id, name);
    }*/

    @DeleteMapping("/{id}")
    public void deleteScoreboard(@PathVariable Long id) {
        service.deleteScoreboardById(id);
    }

}

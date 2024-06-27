package org.demo.fizzbuzzbackend.services;

import org.demo.fizzbuzzbackend.models.Scoreboard;
import org.demo.fizzbuzzbackend.repos.ScoreboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreboardService {

    @Autowired
    private ScoreboardRepository repository;

    public List<Scoreboard> getScoreboard() {
        return repository.findAll();
    }

    public Scoreboard addScoreboard(Scoreboard scoreboard) {
        return repository.save(scoreboard);
    }

}

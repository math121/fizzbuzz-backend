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
        return repository.getAllSorted();
    }

    public Scoreboard addScoreboard(Scoreboard scoreboard) {
        return repository.save(scoreboard);
    }

    public int updateNameOnScoreboard(Long id, String name) {
        return repository.updateNameOnScoreboard(id, name);
    }

    public void deleteScoreboardById(Long id) {
        repository.deleteById(id);
    }
}

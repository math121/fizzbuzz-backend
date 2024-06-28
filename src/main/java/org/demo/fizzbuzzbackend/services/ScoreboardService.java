package org.demo.fizzbuzzbackend.services;

import org.demo.fizzbuzzbackend.models.FizzBuzzUser;
import org.demo.fizzbuzzbackend.models.Scoreboard;
import org.demo.fizzbuzzbackend.repos.FizzBuzzUserRepository;
import org.demo.fizzbuzzbackend.repos.ScoreboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreboardService {

    @Autowired
    private ScoreboardRepository repository;

    @Autowired
    private FizzBuzzUserRepository userRepository;

    public List<Scoreboard> getScoreboard() {
        return repository.findAllByOrderByScoreDesc();
    }

    public Scoreboard addScoreboard(String userName, Scoreboard scoreboard) {
        FizzBuzzUser existingUser = userRepository.findByUserName(userName);
        if (existingUser != null) {
            Scoreboard existingScoreboard = repository.findScoreboardByFizzBuzzUser(existingUser);
            scoreboard.setId(existingScoreboard.getId());
            scoreboard.setFizzBuzzUser(existingUser);
            return repository.save(scoreboard);
        }

        FizzBuzzUser newUser = userRepository.save(new FizzBuzzUser(userName, "Not given"));
        scoreboard.setFizzBuzzUser(newUser);

        return repository.save(scoreboard);
    }

    public Scoreboard getScoreboardForUser(String name) {
        FizzBuzzUser existingUser = userRepository.findByUserName(name);
        if (existingUser != null) {
            return repository.findScoreboardByFizzBuzzUser(existingUser);
        }
        return null;
    }

    /*public int updateNameOnScoreboard(Long id, String name) {
        return repository.updateNameOnScoreboard(id, name);
    }*/

    public void deleteScoreboardById(Long id) {
        repository.deleteById(id);
    }
}

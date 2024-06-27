package org.demo.fizzbuzzbackend.repos;

import org.demo.fizzbuzzbackend.models.Scoreboard;
import org.springframework.data.repository.ListCrudRepository;

public interface ScoreboardRepository extends ListCrudRepository<Scoreboard, Long> {
}

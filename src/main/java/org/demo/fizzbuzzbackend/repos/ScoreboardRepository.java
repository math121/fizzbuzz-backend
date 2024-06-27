package org.demo.fizzbuzzbackend.repos;

import org.demo.fizzbuzzbackend.models.FizzBuzz;
import org.demo.fizzbuzzbackend.models.Scoreboard;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface ScoreboardRepository extends ListCrudRepository<Scoreboard, Long> {
    @Modifying
    @Transactional
    @Query("UPDATE Scoreboard s SET s.userName = :name WHERE s.id = :id")
    int updateNameOnScoreboard(@Param("id") Long id, @Param("name") String name);

    @Query("SELECT s FROM Scoreboard s ORDER BY s.id")
    List<Scoreboard> getAllSorted();

}

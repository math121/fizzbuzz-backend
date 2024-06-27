package org.demo.fizzbuzzbackend.repos;

import org.demo.fizzbuzzbackend.models.FizzBuzz;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FizzBuzzRepository extends ListCrudRepository<FizzBuzz, Long> {
    @Query(value = "SELECT f from FizzBuzz f WHERE f.number <= :upperLimit")
    List<FizzBuzz> listFizzBuzzNumbers(@Param("upperLimit") int upperLimit);
}

package org.demo.fizzbuzzbackend.services;

import org.demo.fizzbuzzbackend.models.FizzBuzz;
import org.demo.fizzbuzzbackend.repos.FizzBuzzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FizzBuzzService {

    @Autowired
    private FizzBuzzRepository repository;

    public List<FizzBuzz> getFizzBuzzNumbers(int upperLimit) {
        return repository.listFizzBuzzNumbers(upperLimit);
    }
}

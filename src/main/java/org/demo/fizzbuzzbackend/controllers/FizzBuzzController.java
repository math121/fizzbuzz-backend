package org.demo.fizzbuzzbackend.controllers;

import org.demo.fizzbuzzbackend.services.FizzBuzzService;
import org.demo.fizzbuzzbackend.models.FizzBuzz;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/fizzbuzz")
public class FizzBuzzController {

    private final FizzBuzzService service;

    public FizzBuzzController(FizzBuzzService service) {
        this.service = service;
    }

    @GetMapping("/{upperLimit}")
    public List<FizzBuzz> getFizzBuzzNumbers(@PathVariable int upperLimit) {
        return service.getFizzBuzzNumbers(upperLimit);
    }

}

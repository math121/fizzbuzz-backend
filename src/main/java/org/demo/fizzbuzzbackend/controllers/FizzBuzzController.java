package org.demo.fizzbuzzbackend.controllers;

import org.demo.fizzbuzzbackend.dtos.FizzBuzzDTO;
import org.demo.fizzbuzzbackend.services.FizzBuzzService;
import org.demo.fizzbuzzbackend.models.FizzBuzz;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fizzbuzz")
@CrossOrigin(origins = "http://localhost:5173/")
public class FizzBuzzController {

    private final FizzBuzzService service;

    public FizzBuzzController(FizzBuzzService service) {
        this.service = service;
    }

    @GetMapping("/{upperLimit}")
    public List<FizzBuzzDTO> getFizzBuzzNumbers(@PathVariable int upperLimit) {
        return service.getFizzBuzzNumbers(upperLimit)
                .stream()
                .map(el -> new FizzBuzzDTO(el.getNumber(), el.getValue()))
                .toList();
    }

}


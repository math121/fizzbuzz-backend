package org.demo.fizzbuzzbackend.models;

import jakarta.persistence.*;

@Entity
public class FizzBuzz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;
    private String value;
}

package org.demo.fizzbuzzbackend.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class FizzBuzz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;
    private String value;

    public String getValue() {
        return value;
    }

    public Long getNumber() {
        return number;
    }
}

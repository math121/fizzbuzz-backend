package org.demo.fizzbuzzbackend.models;

import jakarta.persistence.*;

@Entity
public class FizzBuzzUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userName;
    private String country;

    public FizzBuzzUser(String userName, String country) {
        this.userName = userName;
        this.country = country;
    }

    public FizzBuzzUser() {
    }

    public String getUserName() {
        return userName;
    }

    public Long getUserId() {
        return userId;
    }

    public String getCountry() {
        return country;
    }
}

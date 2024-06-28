package org.demo.fizzbuzzbackend.repos;

import org.demo.fizzbuzzbackend.models.FizzBuzzUser;
import org.springframework.data.repository.ListCrudRepository;

public interface FizzBuzzUserRepository extends ListCrudRepository<FizzBuzzUser, Long> {
    FizzBuzzUser findByUserName(String name);
}

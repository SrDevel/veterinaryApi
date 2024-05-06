package com.veterinary.repository;

import com.veterinary.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findByUsernameAndPassword(String username, String password);
}

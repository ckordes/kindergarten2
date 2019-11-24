package com.ckordes.kindergarten2.repository;

import com.ckordes.kindergarten2.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
    Person findById(long id);
    Person findByEmail(String email);
}

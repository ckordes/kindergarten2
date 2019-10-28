package com.ckordes.kindergarten2.repository;

import com.ckordes.kindergarten2.entity.Allergie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllergieRepository extends JpaRepository<Allergie,Long> {
    Allergie findById(long id);
}
